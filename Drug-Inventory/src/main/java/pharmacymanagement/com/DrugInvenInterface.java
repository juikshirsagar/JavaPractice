package pharmacymanagement.com;

import java.util.List;

public interface DrugInvenInterface {

	public List<DrugInven> viewDrug();

	DrugInven addDrug(DrugInven druginven);

	public void deleteDrug(int id);

	public DrugInven editDrug(int id, DrugInven druginven);
}
