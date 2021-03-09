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
package org.apache.camel.kafkaconnector.awscw;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwscwSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSCW_PATH_NAMESPACE_CONF = "camel.sink.path.namespace";
    public static final String CAMEL_SINK_AWSCW_PATH_NAMESPACE_DOC = "The metric namespace";
    public static final String CAMEL_SINK_AWSCW_PATH_NAMESPACE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_AMAZON_CW_CLIENT_CONF = "camel.sink.endpoint.amazonCwClient";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_AMAZON_CW_CLIENT_DOC = "To use the AmazonCloudWatch as the client";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_AMAZON_CW_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_AUTO_DISCOVER_CLIENT_CONF = "camel.sink.endpoint.autoDiscoverClient";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_AUTO_DISCOVER_CLIENT_DOC = "Setting the autoDiscoverClient mechanism, if true, the component will look for a client instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_AWSCW_ENDPOINT_AUTO_DISCOVER_CLIENT_DEFAULT = true;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSCW_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_NAME_CONF = "camel.sink.endpoint.name";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_NAME_DOC = "The metric name";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the CW client";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PORT_DOC = "To define a proxy port when instantiating the CW client";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the CW client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_REGION_DOC = "The region in which CW client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_TIMESTAMP_CONF = "camel.sink.endpoint.timestamp";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_TIMESTAMP_DOC = "The metric timestamp";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_TIMESTAMP_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_UNIT_CONF = "camel.sink.endpoint.unit";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_UNIT_DOC = "The metric unit";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_UNIT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_VALUE_CONF = "camel.sink.endpoint.value";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_VALUE_DOC = "The metric value";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSCW_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AMAZON_CW_CLIENT_CONF = "camel.component.aws-cw.amazonCwClient";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AMAZON_CW_CLIENT_DOC = "To use the AmazonCloudWatch as the client";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AMAZON_CW_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AUTO_DISCOVER_CLIENT_CONF = "camel.component.aws-cw.autoDiscoverClient";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AUTO_DISCOVER_CLIENT_DOC = "Setting the autoDiscoverClient mechanism, if true, the component will look for a client instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_AWSCW_COMPONENT_AUTO_DISCOVER_CLIENT_DEFAULT = true;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-cw.configuration";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws-cw.lazyStartProducer";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSCW_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_NAME_CONF = "camel.component.aws-cw.name";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_NAME_DOC = "The metric name";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_HOST_CONF = "camel.component.aws-cw.proxyHost";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_HOST_DOC = "To define a proxy host when instantiating the CW client";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_PORT_CONF = "camel.component.aws-cw.proxyPort";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_PORT_DOC = "To define a proxy port when instantiating the CW client";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_PROTOCOL_CONF = "camel.component.aws-cw.proxyProtocol";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the CW client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_REGION_CONF = "camel.component.aws-cw.region";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_REGION_DOC = "The region in which CW client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_TIMESTAMP_CONF = "camel.component.aws-cw.timestamp";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_TIMESTAMP_DOC = "The metric timestamp";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_TIMESTAMP_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_UNIT_CONF = "camel.component.aws-cw.unit";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_UNIT_DOC = "The metric unit";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_UNIT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_VALUE_CONF = "camel.component.aws-cw.value";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_VALUE_DOC = "The metric value";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.aws-cw.autowiredEnabled";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_AWSCW_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-cw.accessKey";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSCW_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-cw.secretKey";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSCW_COMPONENT_SECRET_KEY_DEFAULT = null;

    public CamelAwscwSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwscwSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSCW_PATH_NAMESPACE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_PATH_NAMESPACE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSCW_PATH_NAMESPACE_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_AMAZON_CW_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_AMAZON_CW_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_AMAZON_CW_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_AUTO_DISCOVER_CLIENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSCW_ENDPOINT_AUTO_DISCOVER_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_AUTO_DISCOVER_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSCW_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_NAME_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_TIMESTAMP_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_TIMESTAMP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_TIMESTAMP_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_UNIT_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_ENDPOINT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_VALUE_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWSCW_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSCW_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWSCW_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_AMAZON_CW_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_AMAZON_CW_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_AMAZON_CW_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_AUTO_DISCOVER_CLIENT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSCW_COMPONENT_AUTO_DISCOVER_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_AUTO_DISCOVER_CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSCW_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_NAME_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_TIMESTAMP_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_TIMESTAMP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_TIMESTAMP_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_UNIT_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSCW_COMPONENT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_VALUE_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSCW_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWSCW_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSCW_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_AWSCW_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSCW_COMPONENT_SECRET_KEY_DOC);
        return conf;
    }
}