package pharmacymanagement.com;

public class Order {

	private int id;
	private String Drugname;
	private long Drugprice;
	
	public Order() {
		
	}
	
	public Order(int id, String drugname, long drugprice) {
		super();
		this.id = id;
		Drugname = drugname;
		Drugprice = drugprice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrugname() {
		return Drugname;
	}

	public void setDrugname(String drugname) {
		Drugname = drugname;
	}

	public long getDrugprice() {
		return Drugprice;
	}

	public void setDrugprice(long drugprice) {
		Drugprice = drugprice;
	}
	
	
}
