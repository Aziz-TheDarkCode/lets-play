package zone01dakar.productservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import zone01dakar.productservice.models.*;
import zone01dakar.productservice.models.DTO.ProductUpdateRequest;
import zone01dakar.productservice.service.*;
import java.util.List;
import zone01dakar.productservice.response.ApiResponse;

@RestController
@RequestMapping("api/products")
public class ProductController {

@Autowired
ProductService productService;
    @PostMapping("")
    public ResponseEntity<ApiResponse<Product>> createProduct(@Valid @RequestBody Product p) {
        Product product = productService.saveProduct(p);
        ApiResponse<Product> apiResponse = new ApiResponse<Product>(
            HttpStatus.OK.value(),"success",product);
        return ResponseEntity.ok(apiResponse);
    }
    @GetMapping("")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable String id) {
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> updateProduct(@PathVariable String id ,@RequestBody ProductUpdateRequest updateRequest) {
        Product product = productService.updateProduct(id, updateRequest);
        ApiResponse<Product> apiResponse = new ApiResponse<Product>(
            HttpStatus.OK.value(),"success", product);
            return ResponseEntity.ok(apiResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id); // No need for try-catch here
        return ResponseEntity.noContent().build(); // Return 204 No Content on success
    }
    }

