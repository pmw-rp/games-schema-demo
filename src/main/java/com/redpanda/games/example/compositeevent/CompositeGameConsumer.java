package com.redpanda.games.example.compositeevent;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class CompositeGameConsumer {

    public static void main(String[] args) {

        Properties props = new Properties();

        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put("schema.registry.url", "http://localhost:8081");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, io.confluent.kafka.serializers.KafkaAvroDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, UUID.randomUUID().toString());
        props.put(ConsumerConfig.CLIENT_ID_CONFIG, "your_client_id");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        KafkaConsumer<String, Object> consumer = new KafkaConsumer<>(props);

        String topic = "game-uber-events";

        try {
            consumer.subscribe(List.of(topic));
            ConsumerRecords<String, Object> records = consumer.poll(Duration.ofSeconds(1));
            for (ConsumerRecord<String, Object> record : records) {
                System.out.println(record);
            }
        } catch (Exception e) {
            System.out.println("Oops: " + e);
            // may need to do something with it
        } finally {
            consumer.close();
        }
    }
}
