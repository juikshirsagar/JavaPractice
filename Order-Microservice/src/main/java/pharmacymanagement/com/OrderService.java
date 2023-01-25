package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements OrderServiceInterface{

	@Autowired
	public OrderRepository orderrepo;
	
	@Override
	public List<Order> viewOrder() {
		
		return orderrepo.findAll();
	}

	@Override
	public Order AddOrder(Order order) {
		
		return orderrepo.save(order);
	}

}
