package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService implements SupplierServiceInterface {

	@Autowired
	public SuppInvenRepository supprepo;

	@Override
	public List<Supplier> viewSupplier() {

		return supprepo.findAll();
	}

	@Override
	public Supplier addSupplier(Supplier supplier) {

		return supprepo.save(supplier);
	}

	@Override
	public void deleteSupplier(int id) {
		supprepo.deleteById(id);

	}

	

}
