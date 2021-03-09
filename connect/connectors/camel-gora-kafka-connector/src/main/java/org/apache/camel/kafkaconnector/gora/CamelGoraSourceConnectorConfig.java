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
package org.apache.camel.kafkaconnector.gora;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGoraSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_GORA_PATH_NAME_CONF = "camel.source.path.name";
    public static final String CAMEL_SOURCE_GORA_PATH_NAME_DOC = "Instance name";
    public static final String CAMEL_SOURCE_GORA_PATH_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_DATA_STORE_CLASS_CONF = "camel.source.endpoint.dataStoreClass";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_DATA_STORE_CLASS_DOC = "The type of the dataStore";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_DATA_STORE_CLASS_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_CLASS_CONF = "camel.source.endpoint.keyClass";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_CLASS_DOC = "The type class of the key";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_CLASS_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_VALUE_CLASS_CONF = "camel.source.endpoint.valueClass";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_VALUE_CLASS_DOC = "The type of the value";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_VALUE_CLASS_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_GORA_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_CONCURRENT_CONSUMERS_CONF = "camel.source.endpoint.concurrentConsumers";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_CONCURRENT_CONSUMERS_DOC = "Number of concurrent consumers";
    public static final Integer CAMEL_SOURCE_GORA_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT = 1;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_END_KEY_CONF = "camel.source.endpoint.endKey";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_END_KEY_DOC = "The End Key";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_END_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_END_TIME_CONF = "camel.source.endpoint.endTime";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_END_TIME_DOC = "The End Time";
    public static final Long CAMEL_SOURCE_GORA_ENDPOINT_END_TIME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_FIELDS_CONF = "camel.source.endpoint.fields";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_FIELDS_DOC = "The Fields";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_FIELDS_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_FROM_CONF = "camel.source.endpoint.keyRangeFrom";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_FROM_DOC = "The Key Range From";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_FROM_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_TO_CONF = "camel.source.endpoint.keyRangeTo";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_TO_DOC = "The Key Range To";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_TO_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_LIMIT_CONF = "camel.source.endpoint.limit";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_LIMIT_DOC = "The Limit";
    public static final Long CAMEL_SOURCE_GORA_ENDPOINT_LIMIT_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_START_KEY_CONF = "camel.source.endpoint.startKey";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_START_KEY_DOC = "The Start Key";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_START_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_START_TIME_CONF = "camel.source.endpoint.startTime";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_START_TIME_DOC = "The Start Time";
    public static final Long CAMEL_SOURCE_GORA_ENDPOINT_START_TIME_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_FROM_CONF = "camel.source.endpoint.timeRangeFrom";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_FROM_DOC = "The Time Range From";
    public static final Long CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_FROM_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_TO_CONF = "camel.source.endpoint.timeRangeTo";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_TO_DOC = "The Time Range To";
    public static final Long CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_TO_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_TIMESTAMP_CONF = "camel.source.endpoint.timestamp";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_TIMESTAMP_DOC = "The Timestamp";
    public static final Long CAMEL_SOURCE_GORA_ENDPOINT_TIMESTAMP_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_HADOOP_CONFIGURATION_CONF = "camel.source.endpoint.hadoopConfiguration";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_HADOOP_CONFIGURATION_DOC = "Hadoop Configuration";
    public static final String CAMEL_SOURCE_GORA_ENDPOINT_HADOOP_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_GORA_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.gora.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_GORA_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_GORA_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_GORA_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.gora.autowiredEnabled";
    public static final String CAMEL_SOURCE_GORA_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_GORA_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelGoraSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGoraSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_GORA_PATH_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_PATH_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_GORA_PATH_NAME_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_DATA_STORE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_DATA_STORE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_DATA_STORE_CLASS_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_KEY_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_KEY_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_KEY_CLASS_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_VALUE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_VALUE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_VALUE_CLASS_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GORA_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_CONCURRENT_CONSUMERS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_GORA_ENDPOINT_CONCURRENT_CONSUMERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_CONCURRENT_CONSUMERS_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_END_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_END_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_END_KEY_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_END_TIME_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GORA_ENDPOINT_END_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_END_TIME_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_FIELDS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_FIELDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_FIELDS_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_FROM_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_FROM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_FROM_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_TO_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_KEY_RANGE_TO_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_LIMIT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GORA_ENDPOINT_LIMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_LIMIT_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_START_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_START_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_START_KEY_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_START_TIME_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GORA_ENDPOINT_START_TIME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_START_TIME_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_FROM_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_FROM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_FROM_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_TO_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_TIME_RANGE_TO_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_TIMESTAMP_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_GORA_ENDPOINT_TIMESTAMP_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_TIMESTAMP_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_GORA_ENDPOINT_HADOOP_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_GORA_ENDPOINT_HADOOP_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_ENDPOINT_HADOOP_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_GORA_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GORA_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_GORA_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_GORA_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_GORA_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}