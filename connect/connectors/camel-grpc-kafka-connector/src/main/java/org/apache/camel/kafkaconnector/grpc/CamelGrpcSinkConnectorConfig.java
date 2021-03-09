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
package org.apache.camel.kafkaconnector.grpc;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGrpcSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_GRPC_PATH_HOST_CONF = "camel.sink.path.host";
    public static final String CAMEL_SINK_GRPC_PATH_HOST_DOC = "The gRPC server host name. This is localhost or 0.0.0.0 when being a consumer or remote server host name when using producer.";
    public static final String CAMEL_SINK_GRPC_PATH_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_PATH_PORT_CONF = "camel.sink.path.port";
    public static final String CAMEL_SINK_GRPC_PATH_PORT_DOC = "The gRPC local or remote server port";
    public static final Integer CAMEL_SINK_GRPC_PATH_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_PATH_SERVICE_CONF = "camel.sink.path.service";
    public static final String CAMEL_SINK_GRPC_PATH_SERVICE_DOC = "Fully qualified service name from the protocol buffer descriptor file (package dot service definition name)";
    public static final String CAMEL_SINK_GRPC_PATH_SERVICE_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_CONF = "camel.sink.endpoint.autoDiscoverClientInterceptors";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DOC = "Setting the autoDiscoverClientInterceptors mechanism, if true, the component will look for a ClientInterceptor instance in the registry automatically otherwise it will skip that checking.";
    public static final Boolean CAMEL_SINK_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DEFAULT = true;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_CONF = "camel.sink.endpoint.flowControlWindow";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DOC = "The HTTP/2 flow control window size (MiB)";
    public static final Integer CAMEL_SINK_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DEFAULT = 1048576;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_CONF = "camel.sink.endpoint.maxMessageSize";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DOC = "The maximum message size allowed to be received/sent (MiB)";
    public static final Integer CAMEL_SINK_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DEFAULT = 4194304;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GRPC_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_METHOD_CONF = "camel.sink.endpoint.method";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_METHOD_DOC = "gRPC method name";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_METHOD_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_PRODUCER_STRATEGY_CONF = "camel.sink.endpoint.producerStrategy";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_PRODUCER_STRATEGY_DOC = "The mode used to communicate with a remote gRPC server. In SIMPLE mode a single exchange is translated into a remote procedure call. In STREAMING mode all exchanges will be sent within the same request (input and output of the recipient gRPC service must be of type 'stream'). One of: [SIMPLE] [STREAMING]";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_PRODUCER_STRATEGY_DEFAULT = "SIMPLE";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_STREAM_REPLIES_TO_CONF = "camel.sink.endpoint.streamRepliesTo";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_STREAM_REPLIES_TO_DOC = "When using STREAMING client mode, it indicates the endpoint where responses should be forwarded.";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_STREAM_REPLIES_TO_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_USER_AGENT_CONF = "camel.sink.endpoint.userAgent";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_USER_AGENT_DOC = "The user agent header passed to the server";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_USER_AGENT_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used";
    public static final Boolean CAMEL_SINK_GRPC_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_AUTHENTICATION_TYPE_CONF = "camel.sink.endpoint.authenticationType";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DOC = "Authentication method type in advance to the SSL/TLS negotiation One of: [NONE] [GOOGLE] [JWT]";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT = "NONE";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_ALGORITHM_CONF = "camel.sink.endpoint.jwtAlgorithm";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_ALGORITHM_DOC = "JSON Web Token sign algorithm One of: [HMAC256] [HMAC384] [HMAC512]";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_ALGORITHM_DEFAULT = "HMAC256";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_ISSUER_CONF = "camel.sink.endpoint.jwtIssuer";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_ISSUER_DOC = "JSON Web Token issuer";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_ISSUER_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_SECRET_CONF = "camel.sink.endpoint.jwtSecret";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_SECRET_DOC = "JSON Web Token secret";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_SECRET_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_SUBJECT_CONF = "camel.sink.endpoint.jwtSubject";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_SUBJECT_DOC = "JSON Web Token subject";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_JWT_SUBJECT_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_CONF = "camel.sink.endpoint.keyCertChainResource";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DOC = "The X.509 certificate chain file resource in PEM format link";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_PASSWORD_CONF = "camel.sink.endpoint.keyPassword";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_PASSWORD_DOC = "The PKCS#8 private key file password";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_RESOURCE_CONF = "camel.sink.endpoint.keyResource";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_RESOURCE_DOC = "The PKCS#8 private key file resource in PEM format link";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_KEY_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_NEGOTIATION_TYPE_CONF = "camel.sink.endpoint.negotiationType";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_NEGOTIATION_TYPE_DOC = "Identifies the security negotiation type used for HTTP/2 communication One of: [TLS] [PLAINTEXT_UPGRADE] [PLAINTEXT]";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_NEGOTIATION_TYPE_DEFAULT = "PLAINTEXT";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_CONF = "camel.sink.endpoint.serviceAccountResource";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DOC = "Service Account key file in JSON format resource link supported by the Google Cloud SDK";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_CONF = "camel.sink.endpoint.trustCertCollectionResource";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DOC = "The trusted certificates collection file resource in PEM format for verifying the remote endpoint's certificate";
    public static final String CAMEL_SINK_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DEFAULT = null;
    public static final String CAMEL_SINK_GRPC_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.grpc.lazyStartProducer";
    public static final String CAMEL_SINK_GRPC_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GRPC_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GRPC_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.grpc.autowiredEnabled";
    public static final String CAMEL_SINK_GRPC_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_GRPC_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelGrpcSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGrpcSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_GRPC_PATH_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_PATH_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GRPC_PATH_HOST_DOC);
        conf.define(CAMEL_SINK_GRPC_PATH_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_GRPC_PATH_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GRPC_PATH_PORT_DOC);
        conf.define(CAMEL_SINK_GRPC_PATH_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_PATH_SERVICE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GRPC_PATH_SERVICE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_AUTO_DISCOVER_CLIENT_INTERCEPTORS_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_CONF, ConfigDef.Type.INT, CAMEL_SINK_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_FLOW_CONTROL_WINDOW_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_MAX_MESSAGE_SIZE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRPC_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_METHOD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_METHOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_METHOD_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_PRODUCER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_PRODUCER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_PRODUCER_STRATEGY_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_STREAM_REPLIES_TO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_STREAM_REPLIES_TO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_STREAM_REPLIES_TO_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_USER_AGENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_USER_AGENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_USER_AGENT_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRPC_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_AUTHENTICATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_AUTHENTICATION_TYPE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_JWT_ALGORITHM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_JWT_ALGORITHM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_JWT_ALGORITHM_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_JWT_ISSUER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_JWT_ISSUER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_JWT_ISSUER_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_JWT_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_GRPC_ENDPOINT_JWT_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_JWT_SECRET_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_JWT_SUBJECT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_JWT_SUBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_JWT_SUBJECT_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_KEY_CERT_CHAIN_RESOURCE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_KEY_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_GRPC_ENDPOINT_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_KEY_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_KEY_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_KEY_RESOURCE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_NEGOTIATION_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_NEGOTIATION_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_NEGOTIATION_TYPE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_SERVICE_ACCOUNT_RESOURCE_DOC);
        conf.define(CAMEL_SINK_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_ENDPOINT_TRUST_CERT_COLLECTION_RESOURCE_DOC);
        conf.define(CAMEL_SINK_GRPC_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRPC_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GRPC_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GRPC_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GRPC_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}