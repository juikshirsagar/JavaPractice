package pharmacymanagement.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	public OrderService service;

	@GetMapping("/vieworder")
	public List<Order> view() {
		return service.viewOrder();

	}

	@PostMapping("/addorder")
	public Order addorder(@RequestBody Order order) {
		return service.AddOrder(order);
	}
}
