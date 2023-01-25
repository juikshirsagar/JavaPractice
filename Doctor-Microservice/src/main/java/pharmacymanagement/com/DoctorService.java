package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DoctorService implements DoctorServiceInterface{

	@Autowired
	public OrderRepository orepo;
	
	@Override
	public List<Order> vieworder() {
		
		return orepo.findAll();
	}

	@Override
	public Order addorder(Order order) {
		
		return orepo.save(order);
	}

}
