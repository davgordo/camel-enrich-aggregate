Content Enricher and Aggregator EIPs Combined
=================================================

This project is meant to show how a content enrichment pattern and an aggregator pattern can be combined in order to produce a batch message of several entities consumed from an enrich URI.



To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:org.openpersuasion/demo-aggregation/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
