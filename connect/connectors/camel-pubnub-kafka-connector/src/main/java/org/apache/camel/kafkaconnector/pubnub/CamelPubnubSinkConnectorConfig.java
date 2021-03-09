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
package org.apache.camel.kafkaconnector.pubnub;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelPubnubSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_PUBNUB_PATH_CHANNEL_CONF = "camel.sink.path.channel";
    public static final String CAMEL_SINK_PUBNUB_PATH_CHANNEL_DOC = "The channel used for subscribing/publishing events";
    public static final String CAMEL_SINK_PUBNUB_PATH_CHANNEL_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_UUID_CONF = "camel.sink.endpoint.uuid";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_UUID_DOC = "UUID to be used as a device identifier, a default UUID is generated if not passed.";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_UUID_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_PUBNUB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_OPERATION_DOC = "The operation to perform. PUBLISH: Default. Send a message to all subscribers of a channel. FIRE: allows the client to send a message to BLOCKS Event Handlers. These messages will go directly to any Event Handlers registered on the channel. HERENOW: Obtain information about the current state of a channel including a list of unique user-ids currently subscribed to the channel and the total occupancy count. WHERENOW: Obtain information about the current list of channels to which a uuid is subscribed to. GETSTATE: Used to get key/value pairs specific to a subscriber uuid. State information is supplied as a JSON object of key/value pairs SETSTATE: Used to set key/value pairs specific to a subscriber uuid GETHISTORY: Fetches historical messages of a channel. One of: [HERENOW] [WHERENOW] [GETSTATE] [SETSTATE] [GETHISTORY] [PUBLISH] [FIRE]";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_PUBNUB_CONF = "camel.sink.endpoint.pubnub";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_PUBNUB_DOC = "Reference to a Pubnub client in the registry.";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_PUBNUB_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_AUTH_KEY_CONF = "camel.sink.endpoint.authKey";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_AUTH_KEY_DOC = "If Access Manager is utilized, client will use this authKey in all restricted requests.";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_AUTH_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_CIPHER_KEY_CONF = "camel.sink.endpoint.cipherKey";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_CIPHER_KEY_DOC = "If cipher is passed, all communications to/from PubNub will be encrypted.";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_CIPHER_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_PUBLISH_KEY_CONF = "camel.sink.endpoint.publishKey";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_PUBLISH_KEY_DOC = "The publish key obtained from your PubNub account. Required when publishing messages.";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_PUBLISH_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SECRET_KEY_DOC = "The secret key used for message signing.";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SECURE_CONF = "camel.sink.endpoint.secure";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SECURE_DOC = "Use SSL for secure transmission.";
    public static final Boolean CAMEL_SINK_PUBNUB_ENDPOINT_SECURE_DEFAULT = true;
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SUBSCRIBE_KEY_CONF = "camel.sink.endpoint.subscribeKey";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SUBSCRIBE_KEY_DOC = "The subscribe key obtained from your PubNub account. Required when subscribing to channels or listening for presence events";
    public static final String CAMEL_SINK_PUBNUB_ENDPOINT_SUBSCRIBE_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_PUBNUB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.pubnub.lazyStartProducer";
    public static final String CAMEL_SINK_PUBNUB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_PUBNUB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_PUBNUB_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.pubnub.autowiredEnabled";
    public static final String CAMEL_SINK_PUBNUB_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_PUBNUB_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelPubnubSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelPubnubSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_PUBNUB_PATH_CHANNEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PUBNUB_PATH_CHANNEL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_PUBNUB_PATH_CHANNEL_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_UUID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PUBNUB_ENDPOINT_UUID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_UUID_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PUBNUB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PUBNUB_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_PUBNUB_CONF, ConfigDef.Type.STRING, CAMEL_SINK_PUBNUB_ENDPOINT_PUBNUB_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_PUBNUB_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_AUTH_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_PUBNUB_ENDPOINT_AUTH_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_AUTH_KEY_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_CIPHER_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_PUBNUB_ENDPOINT_CIPHER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_CIPHER_KEY_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_PUBLISH_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_PUBNUB_ENDPOINT_PUBLISH_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_PUBLISH_KEY_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_PUBNUB_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_SECURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PUBNUB_ENDPOINT_SECURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_SECURE_DOC);
        conf.define(CAMEL_SINK_PUBNUB_ENDPOINT_SUBSCRIBE_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_PUBNUB_ENDPOINT_SUBSCRIBE_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_ENDPOINT_SUBSCRIBE_KEY_DOC);
        conf.define(CAMEL_SINK_PUBNUB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PUBNUB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_PUBNUB_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_PUBNUB_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_PUBNUB_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}