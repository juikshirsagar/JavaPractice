package pharmacymanagement.com;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Doctor")
public class Doctor {

	@Id
	private int id;
	private String name;
	private String email;
	private long phoneNumber;

	private List<Order> oder;
	
	
	public Doctor(int id, String name, String email, long phoneNumber, List<Order> oder) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.setOder(oder);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Order> getOder() {
		return oder;
	}

	public void setOder(List<Order> oder) {
		this.oder = oder;
	}

}
