package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	public SupplierService service;

	@PostMapping("/addSupplier")
	public Supplier addSupplier(@RequestBody Supplier supplier) {
		return service.addSupplier(supplier);

	}

	@GetMapping("/allSupplier")
	public List<Supplier> view() {
		return service.viewSupplier();
	}

	@DeleteMapping("/delete/id")
	public void delete(@PathVariable int id) {
		service.deleteSupplier(id);
	}
}
