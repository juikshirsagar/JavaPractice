package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/druginven")
public class DrugInvenController {

	@Autowired
	public DrugInvenService dservice;

	//to get list of drugs
	@GetMapping("/viewDrug")
	public List<DrugInven> view() {
		return dservice.viewDrug();
	}

	//to add drugs
	@PostMapping("/addDrug")
	public DrugInven addDrug(@RequestBody DrugInven driginven) {
		return dservice.addDrug(driginven);

	}

	//to delete drugs
	@DeleteMapping
	public void deleteDrug(@PathVariable int id) {
		dservice.deleteDrug(id);
	}

	//to update the drugs
	@PutMapping
	public DrugInven editDrugs(@PathVariable int id, @RequestBody DrugInven druginven) {
		return dservice.editDrug(id, druginven);
	}
}
