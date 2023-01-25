package pharmacymanagement.com;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Supplier")
public class Supplier {

	@Id
	private int id;
	private String name;
	private String email;
	private long phoneno;
	private String drugname;
	private long drugprice;

	public Supplier() {
	}

	public Supplier(int id, String name, String email, long phoneno, String drugname, long drugprice) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.drugname = drugname;
		this.drugprice = drugprice;
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

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getDrugname() {
		return drugname;
	}

	public void setDrugname(String drugname) {
		this.drugname = drugname;
	}

	public long getDrugprice() {
		return drugprice;
	}

	public void setDrugprice(long drugprice) {
		this.drugprice = drugprice;
	}
}
