package pharmacymanagement.com;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DrugRepository extends MongoRepository<DrugInven,Integer>{

}
