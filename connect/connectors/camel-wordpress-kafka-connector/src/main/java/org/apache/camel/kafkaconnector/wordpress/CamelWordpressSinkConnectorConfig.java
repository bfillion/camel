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
package org.apache.camel.kafkaconnector.wordpress;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWordpressSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_WORDPRESS_PATH_OPERATION_CONF = "camel.sink.path.operation";
    public static final String CAMEL_SINK_WORDPRESS_PATH_OPERATION_DOC = "The endpoint operation. One of: [post] [user]";
    public static final String CAMEL_SINK_WORDPRESS_PATH_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_PATH_OPERATION_DETAIL_CONF = "camel.sink.path.operationDetail";
    public static final String CAMEL_SINK_WORDPRESS_PATH_OPERATION_DETAIL_DOC = "The second part of an endpoint operation. Needed only when endpoint semantic is not enough, like wordpress:post:delete One of: [delete]";
    public static final String CAMEL_SINK_WORDPRESS_PATH_OPERATION_DETAIL_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_API_VERSION_CONF = "camel.sink.endpoint.apiVersion";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_API_VERSION_DOC = "The Wordpress REST API version";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_API_VERSION_DEFAULT = "2";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_CRITERIA_CONF = "camel.sink.endpoint.criteria";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_CRITERIA_DOC = "The criteria to use with complex searches.";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_FORCE_CONF = "camel.sink.endpoint.force";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_FORCE_DOC = "Whether to bypass trash and force deletion.";
    public static final Boolean CAMEL_SINK_WORDPRESS_ENDPOINT_FORCE_DEFAULT = false;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_ID_CONF = "camel.sink.endpoint.id";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_ID_DOC = "The entity ID. Should be passed when the operation performed requires a specific entity, e.g. deleting a post";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_PASSWORD_DOC = "Password from authorized user";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_CONF = "camel.sink.endpoint.searchCriteria";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DOC = "Search criteria";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_URL_CONF = "camel.sink.endpoint.url";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_URL_DOC = "The Wordpress API URL from your site, e.g. http://myblog.com/wp-json/";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_URL_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_USER_CONF = "camel.sink.endpoint.user";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_USER_DOC = "Authorized user to perform writing operations";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_USER_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_WORDPRESS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WORDPRESS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_API_VERSION_CONF = "camel.component.wordpress.apiVersion";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_API_VERSION_DOC = "The Wordpress REST API version";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_API_VERSION_DEFAULT = "2";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_CONFIGURATION_CONF = "camel.component.wordpress.configuration";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_CONFIGURATION_DOC = "Wordpress configuration";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_CRITERIA_CONF = "camel.component.wordpress.criteria";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_CRITERIA_DOC = "The criteria to use with complex searches.";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_FORCE_CONF = "camel.component.wordpress.force";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_FORCE_DOC = "Whether to bypass trash and force deletion.";
    public static final Boolean CAMEL_SINK_WORDPRESS_COMPONENT_FORCE_DEFAULT = false;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_ID_CONF = "camel.component.wordpress.id";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_ID_DOC = "The entity ID. Should be passed when the operation performed requires a specific entity, e.g. deleting a post";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_PASSWORD_CONF = "camel.component.wordpress.password";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_PASSWORD_DOC = "Password from authorized user";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_SEARCH_CRITERIA_CONF = "camel.component.wordpress.searchCriteria";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DOC = "Search criteria";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_URL_CONF = "camel.component.wordpress.url";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_URL_DOC = "The Wordpress API URL from your site, e.g. http://myblog.com/wp-json/";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_URL_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_USER_CONF = "camel.component.wordpress.user";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_USER_DOC = "Authorized user to perform writing operations";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_USER_DEFAULT = null;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.wordpress.lazyStartProducer";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WORDPRESS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.wordpress.autowiredEnabled";
    public static final String CAMEL_SINK_WORDPRESS_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_WORDPRESS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelWordpressSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWordpressSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_WORDPRESS_PATH_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_PATH_OPERATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORDPRESS_PATH_OPERATION_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_PATH_OPERATION_DETAIL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_PATH_OPERATION_DETAIL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_PATH_OPERATION_DETAIL_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_API_VERSION_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_CRITERIA_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_FORCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORDPRESS_ENDPOINT_FORCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_FORCE_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_ID_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_SEARCH_CRITERIA_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORDPRESS_ENDPOINT_URL_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORDPRESS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_API_VERSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_API_VERSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_API_VERSION_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_CRITERIA_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_FORCE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORDPRESS_COMPONENT_FORCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_FORCE_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_ID_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_SEARCH_CRITERIA_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_SEARCH_CRITERIA_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_WORDPRESS_COMPONENT_URL_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WORDPRESS_COMPONENT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_USER_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORDPRESS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WORDPRESS_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WORDPRESS_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WORDPRESS_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}