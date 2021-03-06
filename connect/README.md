## Log

```bash
curl -i -X POST -H "Accept:application/json" -H "Content-Type:application/json" http://localhost:8083/connectors/ -d @log.json
```

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

## File watcher

```bash
curl -i -X POST -H "Accept:application/json" -H "Content-Type:application/json" http://localhost:8083/connectors/ -d @file-watcher.json
```

```json
{
    "name": "CamelFile-watchSourceConnector-0",
    "config": {
        "connector.class": "org.apache.camel.kafkaconnector.filewatch.CamelFilewatchSourceConnector",
        "tasks.max": "1",
        "topics": "test-topic",
        "key.converter": "org.apache.kafka.connect.storage.StringConverter",
        "value.converter": "org.apache.kafka.connect.storage.StringConverter",
        "camel.source.path.path": "/usr/share/fichiers"
    }
}
```

## Kafka vers kafka

```bash
curl -i -X POST -H "Accept:application/json" -H "Content-Type:application/json" http://localhost:8083/connectors/ -d @kafka-kafka.json
```

```json
{
    "name": "CamelKafkaSourceConnector-0",
    "config": {
        "connector.class": "org.apache.camel.kafkaconnector.kafka.CamelKafkaSourceConnector",
        "camel.source.endpoint.brokers": "broker:9092",
        "tasks.max": "1",
        "topics": "test-topic-copie",
        "key.converter": "org.apache.kafka.connect.storage.StringConverter",
        "value.converter": "org.apache.kafka.connect.storage.StringConverter",
        "camel.source.path.topic": "test-topic"
    }
}
```

```json
{
    "name": "CamelKafkaSinkConnector-0",
    "config": {
        "connector.class": "org.apache.camel.kafkaconnector.kafka.CamelKafkaSinkConnector",
        "camel.sink.endpoint.brokers": "broker:9092",
        "tasks.max": "1",
        "topics": "test-topic",
        "key.converter": "org.apache.kafka.connect.storage.StringConverter",
        "value.converter": "org.apache.kafka.connect.storage.StringConverter",
        "camel.sink.path.topic": "test-topic-copie"
    }
}
```