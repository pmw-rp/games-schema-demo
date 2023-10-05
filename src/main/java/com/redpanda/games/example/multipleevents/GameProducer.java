package com.redpanda.games.example.multipleevents;

import com.redpanda.games.generated.common.GameStart;
import com.redpanda.games.generated.common.GameStop;
import com.redpanda.games.generated.specific.GameUpdate;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class GameProducer {

    public static void main(String[] args) {

        Properties props = new Properties();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, io.confluent.kafka.serializers.KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://localhost:8081");
        props.put("value.subject.name.strategy", io.confluent.kafka.serializers.subject.RecordNameStrategy.class);

        KafkaProducer<String, Object> producer = new KafkaProducer<>(props);

        String topic = "game-events";

        try {

            GameStart start = new GameStart(1, System.currentTimeMillis());
            ProducerRecord<String, Object> record = new ProducerRecord<>(topic, start);
            producer.send(record);

            GameUpdate split = new GameUpdate(0, 100, 10.1);
            record = new ProducerRecord<>(topic, split);
            producer.send(record);

            GameStop stop = new GameStop(1, System.currentTimeMillis(), "Gamer 1");
            record = new ProducerRecord<>(topic, stop);
            producer.send(record);

        } catch (Exception e) {
            System.out.println("Oops: " + e);
            // may need to do something with it
        } finally {
            producer.flush();
            producer.close();
        }
    }
}
