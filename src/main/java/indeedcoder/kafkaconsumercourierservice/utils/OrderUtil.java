package indeedcoder.kafkaconsumercourierservice.utils;

import indeedcoder.kafkaconsumercourierservice.entity.CourierOrder;
import indeedcoder.kafkaconsumercourierservice.model.CustomerOrder;

public class OrderUtil {

	private OrderUtil() {
	}

	public static CourierOrder getCourierOrder(CustomerOrder customerOrder) {
		return new CourierOrder(customerOrder.getId(), customerOrder.getCustomerName(), customerOrder.getCity(),
				customerOrder.getDateOfOrder());
	}
}
