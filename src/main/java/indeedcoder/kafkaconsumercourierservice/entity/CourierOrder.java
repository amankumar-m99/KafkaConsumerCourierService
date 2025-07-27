package indeedcoder.kafkaconsumercourierservice.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourierOrder implements Serializable {

	private static final long serialVersionUID = 6930676946305432271L;

	private String id;
	private String customerName;
	private String city;
	private Date dateOfOrder;

}
