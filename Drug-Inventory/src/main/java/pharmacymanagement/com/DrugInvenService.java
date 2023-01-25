package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrugInvenService implements DrugInvenInterface {

	@Autowired
	public DrugRepository drugrepo;

	@Override
	public List<DrugInven> viewDrug() {

		return drugrepo.findAll();
	}

	@Override
	public DrugInven addDrug(DrugInven druginven) {

		return drugrepo.save(druginven);
	}

	@Override
	public void deleteDrug(int id) {
		drugrepo.deleteById(id);

	}

	@Override
	public DrugInven editDrug(int id, DrugInven druginven) {

		return drugrepo.save(druginven);
	}

}
