```json
{
    "name": "CamelLogSinkConnector-0",
    "config": {
        "connector.class": "org.apache.camel.kafkaconnector.log.CamelLogSinkConnector",
        "tasks.max": "1",
        "topics": "test-topic",
        "key.converter": "org.apache.kafka.connect.storage.StringConverter",
        "value.converter": "org.apache.kafka.connect.storage.StringConverter",
        "camel.sink.path.loggerName": "test-log"
    }
}
```