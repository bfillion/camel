/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.awssdb;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwssdbSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSSDB_PATH_DOMAIN_NAME_CONF = "camel.sink.path.domainName";
    public static final String CAMEL_SINK_AWSSDB_PATH_DOMAIN_NAME_DOC = "The name of the domain currently worked with.";
    public static final String CAMEL_SINK_AWSSDB_PATH_DOMAIN_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_AMAZON_SDBCLIENT_CONF = "camel.sink.endpoint.amazonSDBClient";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_AMAZON_SDBCLIENT_DOC = "To use the AmazonSimpleDB as the client";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_AMAZON_SDBCLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_CONSISTENT_READ_CONF = "camel.sink.endpoint.consistentRead";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_CONSISTENT_READ_DOC = "Determines whether or not strong consistency should be enforced when data is read.";
    public static final Boolean CAMEL_SINK_AWSSDB_ENDPOINT_CONSISTENT_READ_DEFAULT = false;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSSDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_MAX_NUMBER_OF_DOMAINS_CONF = "camel.sink.endpoint.maxNumberOfDomains";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_MAX_NUMBER_OF_DOMAINS_DOC = "The maximum number of domain names you want returned. The range is 1 to 100.";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_MAX_NUMBER_OF_DOMAINS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_OPERATION_DOC = "Operation to perform One of: [BatchDeleteAttributes] [BatchPutAttributes] [DeleteAttributes] [DeleteDomain] [DomainMetadata] [GetAttributes] [ListDomains] [PutAttributes] [Select]";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_OPERATION_DEFAULT = "PutAttributes";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the SDB client";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PORT_DOC = "To define a proxy port when instantiating the SDB client";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the SDB client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_REGION_DOC = "The region in which SDB client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSSDB_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSSDB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws-sdb.lazyStartProducer";
    public static final String CAMEL_SINK_AWSSDB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSSDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSSDB_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.aws-sdb.autowiredEnabled";
    public static final String CAMEL_SINK_AWSSDB_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AWSSDB_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelAwssdbSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwssdbSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSSDB_PATH_DOMAIN_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_PATH_DOMAIN_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSSDB_PATH_DOMAIN_NAME_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_AMAZON_SDBCLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_AMAZON_SDBCLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_AMAZON_SDBCLIENT_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_CONSISTENT_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSDB_ENDPOINT_CONSISTENT_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_CONSISTENT_READ_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSDB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_MAX_NUMBER_OF_DOMAINS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_MAX_NUMBER_OF_DOMAINS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_MAX_NUMBER_OF_DOMAINS_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSSDB_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSSDB_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSSDB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSDB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSSDB_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSSDB_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSSDB_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}