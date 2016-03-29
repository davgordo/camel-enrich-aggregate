package org.openpersuasion.demo.aggregation;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Test;

public class RouteTest extends CamelBlueprintTestSupport {
    
	
    @Override
    protected String getBlueprintDescriptor() {
        return "OSGI-INF/blueprint/blueprint.xml";
    }

    @Test
    public void testRoute() throws Exception {

        template.sendBody("seda:enrich", "entity1");
        template.sendBody("seda:enrich", "entity2");
        
        MockEndpoint result = getMockEndpoint("mock:result");
        result.expectedBodiesReceived("enrich me+entity1+enrich me+entity2");
        
        template.sendBody("direct:start", "enrich me");
        template.sendBody("direct:start", "enrich me");
        assertMockEndpointsSatisfied();
    }

}
