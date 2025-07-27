package indeedcoder.kafkaconsumercourierservice.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {

	private String id;
	private String customerName;
	private String itemId;
	private String city;
	private Date dateOfOrder;

}
