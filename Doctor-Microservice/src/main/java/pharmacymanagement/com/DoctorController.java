package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	
	@Autowired
	public DoctorService service;
	
	public List<Order> viewOrder(){
		return service.vieworder();
	}
}
