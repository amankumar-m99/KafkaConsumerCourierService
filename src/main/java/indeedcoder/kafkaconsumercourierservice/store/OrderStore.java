package indeedcoder.kafkaconsumercourierservice.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import indeedcoder.kafkaconsumercourierservice.entity.CourierOrder;
import indeedcoder.kafkaconsumercourierservice.model.CustomerOrder;
import indeedcoder.kafkaconsumercourierservice.repository.CourierOrderRepository;
import indeedcoder.kafkaconsumercourierservice.utils.JsonUtil;
import indeedcoder.kafkaconsumercourierservice.utils.OrderUtil;

@Component
public class OrderStore {

	@Autowired
	private CourierOrderRepository repository;

	public void createOrder(String message) {
		CustomerOrder customerOrder = JsonUtil.toOrder(message, CustomerOrder.class);
		CourierOrder courierOrder = OrderUtil.getCourierOrder(customerOrder);
		repository.add(courierOrder);
	}

	public List<CourierOrder> getAllOrders() {
		return repository.getAll().values().stream().toList();
	}
}
