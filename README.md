./kafka-topics.sh --create  --topic example-topic --zookeeper localhost:2181 --partitions 1 --replication-factor 1



./kafka-console-consumer.sh --topic example-topic --from-beginning --bootstrap-server localhost:9092