package indeedcoder.kafkaconsumercourierservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import indeedcoder.kafkaconsumercourierservice.store.OrderStore;

@Service
public class KafkaConsumerService {

	@Autowired
	private OrderStore orderStore;

	@KafkaListener(topics = "${my-app-kafka-topic-name}", groupId = "${spring.kafka.consumer.group-id}")
	public void readOrder(String order) {
		orderStore.createOrder(order);
	}
}

