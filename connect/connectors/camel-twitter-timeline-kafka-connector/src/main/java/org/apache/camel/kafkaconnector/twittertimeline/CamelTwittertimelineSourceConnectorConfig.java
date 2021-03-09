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
package org.apache.camel.kafkaconnector.twittertimeline;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelTwittertimelineSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_TWITTERTIMELINE_PATH_TIMELINE_TYPE_CONF = "camel.source.path.timelineType";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DOC = "The timeline type to produce/consume. One of: [PUBLIC] [HOME] [USER] [MENTIONS] [RETWEETSOFME] [UNKNOWN]";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_CONF = "camel.source.endpoint.user";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_DOC = "The username when using timelineType=user";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TYPE_CONF = "camel.source.endpoint.type";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TYPE_DOC = "Endpoint type to use. One of: [polling] [direct]";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TYPE_DEFAULT = "polling";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DISTANCE_METRIC_CONF = "camel.source.endpoint.distanceMetric";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DISTANCE_METRIC_DOC = "Used by the geography search, to search by radius using the configured metrics. The unit can either be mi for miles, or km for kilometers. You need to configure all the following options: longitude, latitude, radius, and distanceMetric. One of: [km] [mi]";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DISTANCE_METRIC_DEFAULT = "km";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXTENDED_MODE_CONF = "camel.source.endpoint.extendedMode";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXTENDED_MODE_DOC = "Used for enabling full text from twitter (eg receive tweets that contains more than 140 characters).";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXTENDED_MODE_DEFAULT = true;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LATITUDE_CONF = "camel.source.endpoint.latitude";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LATITUDE_DOC = "Used by the geography search to search by latitude. You need to configure all the following options: longitude, latitude, radius, and distanceMetric.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LATITUDE_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LOCATIONS_CONF = "camel.source.endpoint.locations";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LOCATIONS_DOC = "Bounding boxes, created by pairs of lat/lons. Can be used for filter. A pair is defined as lat,lon. And multiple paris can be separated by semi colon.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LOCATIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LONGITUDE_CONF = "camel.source.endpoint.longitude";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LONGITUDE_DOC = "Used by the geography search to search by longitude. You need to configure all the following options: longitude, latitude, radius, and distanceMetric.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LONGITUDE_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RADIUS_CONF = "camel.source.endpoint.radius";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RADIUS_DOC = "Used by the geography search to search by radius. You need to configure all the following options: longitude, latitude, radius, and distanceMetric.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RADIUS_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_COUNT_CONF = "camel.source.endpoint.count";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_COUNT_DOC = "Limiting number of results per page.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_COUNT_DEFAULT = "5";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_FILTER_OLD_CONF = "camel.source.endpoint.filterOld";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_FILTER_OLD_DOC = "Filter out old tweets, that has previously been polled. This state is stored in memory only, and based on last tweet id.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_FILTER_OLD_DEFAULT = true;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LANG_CONF = "camel.source.endpoint.lang";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LANG_DOC = "The lang string ISO_639-1 which will be used for searching";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LANG_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_NUMBER_OF_PAGES_CONF = "camel.source.endpoint.numberOfPages";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_NUMBER_OF_PAGES_DOC = "The number of pages result which you want camel-twitter to consume.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_NUMBER_OF_PAGES_DEFAULT = "1";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SINCE_ID_CONF = "camel.source.endpoint.sinceId";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SINCE_ID_DOC = "The last tweet id which will be used for pulling the tweets. It is useful when the camel route is restarted after a long running.";
    public static final Long CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SINCE_ID_DEFAULT = 1L;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_IDS_CONF = "camel.source.endpoint.userIds";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_IDS_DOC = "To filter by user ids for filter. Multiple values can be separated by comma.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_IDS_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_CONF = "camel.source.endpoint.httpProxyHost";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DOC = "The http proxy host which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_CONF = "camel.source.endpoint.httpProxyPassword";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DOC = "The http proxy password which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_CONF = "camel.source.endpoint.httpProxyPort";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DOC = "The http proxy port which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_CONF = "camel.source.endpoint.httpProxyUser";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DOC = "The http proxy user which can be used for the camel-twitter. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DELAY_DEFAULT = 30000L;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component. Use value spring or quartz for built in scheduler";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_CONF = "camel.source.endpoint.accessToken";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DOC = "The access token. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_CONF = "camel.source.endpoint.accessTokenSecret";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DOC = "The access secret. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_CONF = "camel.source.endpoint.consumerKey";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DOC = "The consumer key. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_CONF = "camel.source.endpoint.consumerSecret";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DOC = "The consumer secret. Can also be configured on the TwitterComponent level instead.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SORT_BY_ID_CONF = "camel.source.endpoint.sortById";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SORT_BY_ID_DOC = "Sorts by id, so the oldest are first, and newest last.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SORT_BY_ID_DEFAULT = true;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.twitter-timeline.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.twitter-timeline.autowiredEnabled";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_CONF = "camel.component.twitter-timeline.httpProxyHost";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DOC = "The http proxy host which can be used for the camel-twitter.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_CONF = "camel.component.twitter-timeline.httpProxyPassword";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DOC = "The http proxy password which can be used for the camel-twitter.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_CONF = "camel.component.twitter-timeline.httpProxyPort";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DOC = "The http proxy port which can be used for the camel-twitter.";
    public static final Integer CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_CONF = "camel.component.twitter-timeline.httpProxyUser";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DOC = "The http proxy user which can be used for the camel-twitter.";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_CONF = "camel.component.twitter-timeline.accessToken";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DOC = "The access token";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_CONF = "camel.component.twitter-timeline.accessTokenSecret";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DOC = "The access token secret";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_CONF = "camel.component.twitter-timeline.consumerKey";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DOC = "The consumer key";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_CONF = "camel.component.twitter-timeline.consumerSecret";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DOC = "The consumer secret";
    public static final String CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DEFAULT = null;

    public CamelTwittertimelineSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelTwittertimelineSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_PATH_TIMELINE_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_TWITTERTIMELINE_PATH_TIMELINE_TYPE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TYPE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DISTANCE_METRIC_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DISTANCE_METRIC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DISTANCE_METRIC_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXTENDED_MODE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXTENDED_MODE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_EXTENDED_MODE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LATITUDE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LATITUDE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LATITUDE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LOCATIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LOCATIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LOCATIONS_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LONGITUDE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LONGITUDE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LONGITUDE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RADIUS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RADIUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RADIUS_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_COUNT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_FILTER_OLD_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_FILTER_OLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_FILTER_OLD_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LANG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LANG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_LANG_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_NUMBER_OF_PAGES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_NUMBER_OF_PAGES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_NUMBER_OF_PAGES_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SINCE_ID_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SINCE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SINCE_ID_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_IDS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_IDS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USER_IDS_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_HOST_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_PORT_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_HTTP_PROXY_USER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_ACCESS_TOKEN_SECRET_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_CONSUMER_SECRET_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SORT_BY_ID_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SORT_BY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_ENDPOINT_SORT_BY_ID_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_HOST_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_PORT_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_HTTP_PROXY_USER_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_ACCESS_TOKEN_SECRET_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_KEY_DOC);
        conf.define(CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_TWITTERTIMELINE_COMPONENT_CONSUMER_SECRET_DOC);
        return conf;
    }
}