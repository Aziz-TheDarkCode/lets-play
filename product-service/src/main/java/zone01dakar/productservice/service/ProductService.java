package zone01dakar.productservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import zone01dakar.productservice.repository.*;
import zone01dakar.productservice.models.*;
import zone01dakar.productservice.models.DTO.ProductUpdateRequest;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts () {
        return productRepository.findAll() ;
    }
    public Product getProduct (String id) {
        return productRepository.findById(id).orElse(null);
    }
   public Product saveProduct (@Validated Product prod) {
        return productRepository.save(prod);
   }
   public Product updateProduct(String id, ProductUpdateRequest updateRequest) {
       Product existingProduct = productRepository.findById(id).orElse(null);
       if (existingProduct != null) {
           if (updateRequest.getName() != null) {
               existingProduct.setName(updateRequest.getName());
           }
           if (updateRequest.getDescription() != null) {
               existingProduct.setDescription(updateRequest.getDescription());
           }
           if (updateRequest.getPrice() != null) {
               existingProduct.setPrice(updateRequest.getPrice());
           }
           return productRepository.save(existingProduct);
       }
       return null;
   }

}
