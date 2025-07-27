package indeedcoder.kafkaconsumercourierservice.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static ObjectMapper objectMapper = new ObjectMapper();

	private JsonUtil() {}

	public static String toJson(Object object) {
		String jsonString = null;
		try {
			jsonString = objectMapper.writeValueAsString(object);
		} catch (Exception e) {
		}
		return jsonString;
	}
	public static <T> T toOrder(String json, Class<T> valueType) {
		T order = null;
		try {
			order = objectMapper.readValue(json, valueType);
		} catch (Exception e) {
		}
		return order;
	}
}
