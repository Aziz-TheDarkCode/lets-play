package zone01dakar.productservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import zone01dakar.productservice.models.*;
public interface ProductRepository extends MongoRepository<Product,String> {

}
