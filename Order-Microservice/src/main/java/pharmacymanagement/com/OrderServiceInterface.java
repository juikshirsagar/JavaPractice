package pharmacymanagement.com;

import java.util.List;

public interface OrderServiceInterface {

	
	public List<Order> viewOrder();
	public Order AddOrder(Order order);
}
