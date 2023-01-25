package pharmacymanagement.com;

import java.util.List;

public interface DoctorServiceInterface {

  public List<Order> vieworder();
  
  public Order addorder(Order order);
}
