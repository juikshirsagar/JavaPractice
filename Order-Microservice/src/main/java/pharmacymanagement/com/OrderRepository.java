package pharmacymanagement.com;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,Integer> {

}
