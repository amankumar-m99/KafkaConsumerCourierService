package indeedcoder.kafkaconsumercourierservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import indeedcoder.kafkaconsumercourierservice.entity.CourierOrder;
import indeedcoder.kafkaconsumercourierservice.store.OrderStore;

@RestController
public class ConsumerController {

	@Autowired
	private OrderStore orderStore;

	@GetMapping("/all-orders")
	public List<CourierOrder> getAllOrders(){
		return orderStore.getAllOrders();
	}
}
