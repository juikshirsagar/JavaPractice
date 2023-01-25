package pharmacymanagement.com;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DrugInven")
public class DrugInven {
	@Id
	private int id;
	private String dname;
	private long dprice;

	public DrugInven() {
	}

	public DrugInven(int id, String dname, long dprice) {
		super();
		this.id = id;
		this.dname = dname;
		this.dprice = dprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public long getDprice() {
		return dprice;
	}

	public void setDprice(long dprice) {
		this.dprice = dprice;
	}

}
