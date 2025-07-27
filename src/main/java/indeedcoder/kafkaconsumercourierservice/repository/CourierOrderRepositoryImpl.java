package indeedcoder.kafkaconsumercourierservice.repository;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import indeedcoder.kafkaconsumercourierservice.entity.CourierOrder;
import jakarta.annotation.Resource;

@Repository
public class CourierOrderRepositoryImpl implements CourierOrderRepository {

	private static final String KEY = "COURIERORDER";

	@Resource(name = "getRedisTemplate") //tells Spring to inject the bean by this name.
	private HashOperations<String, String, CourierOrder> hashOperations;
	//<ref type, key type, value type>

	@Override
	public void add(CourierOrder courierOrder) {
		hashOperations.putIfAbsent(KEY, courierOrder.getId(), courierOrder);
	}

	@Override
	public void modify(CourierOrder courierOrder) {
		hashOperations.put(KEY, courierOrder.getId(), courierOrder);
	}

	@Override
	public CourierOrder getOne(String id) {
		return hashOperations.get(KEY, id);
	}

	@Override
	public Map<String, CourierOrder> getAll() {
		return hashOperations.entries(KEY);
	}

	@Override
	public void remove(String id) {
		hashOperations.delete(KEY, id);
	}

}
