package indeedcoder.kafkaconsumercourierservice.repository;

import java.util.Map;

import indeedcoder.kafkaconsumercourierservice.entity.CourierOrder;

public interface CourierOrderRepository {

	void add(CourierOrder sellerOrder);
	void modify(CourierOrder sellerOrder);
	CourierOrder getOne(String id);
	Map<String, CourierOrder> getAll();
	void remove(String id);

}
