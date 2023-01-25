package pharmacymanagement.com;

import java.util.List;

public interface SupplierServiceInterface {

	public List<Supplier> viewSupplier();
	
	Supplier addSupplier(Supplier supplier);

	public void deleteSupplier(int id);

}
