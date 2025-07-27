package indeedcoder.kafkaconsumercourierservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import indeedcoder.kafkaconsumercourierservice.entity.CourierOrder;

@Configuration
public class AppConfig {

	@Bean
	public RedisConnectionFactory getRedisConnectionFactory() {
		return new LettuceConnectionFactory();
	}

	@Bean
	public RedisTemplate<String, CourierOrder> getRedisTemplate(){
		RedisTemplate<String, CourierOrder> template = new RedisTemplate<>();
		template.setConnectionFactory(getRedisConnectionFactory());
		return template;
	}
}

