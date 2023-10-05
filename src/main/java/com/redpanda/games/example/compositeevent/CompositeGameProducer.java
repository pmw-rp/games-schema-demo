package com.redpanda.games.example.compositeevent;

import com.redpanda.games.generated.common.GameStart;
import com.redpanda.games.generated.common.GameStop;
import com.redpanda.games.generated.composite.UberGameEvent;
import com.redpanda.games.generated.specific.GameUpdate;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class CompositeGameProducer {

    public static void main(String[] args) {

        Properties props = new Properties();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, io.confluent.kafka.serializers.KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://localhost:8081");

        KafkaProducer<String, Object> producer = new KafkaProducer<>(props);

        String topic = "game-uber-events";

        try {
            UberGameEvent event = new UberGameEvent(new GameStart(1, System.currentTimeMillis()), null, null);
            ProducerRecord<String, Object> record = new ProducerRecord<>(topic, event);
            producer.send(record);

            event = new UberGameEvent(null, new GameUpdate(0, 100, 10.1), null);
            record = new ProducerRecord<>(topic, event);
            producer.send(record);

            event = new UberGameEvent(null, null, new GameStop(1, System.currentTimeMillis(), "Gamer 2"));
            record = new ProducerRecord<>(topic, event);
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
