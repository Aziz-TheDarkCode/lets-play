package zone01dakar.productservice.models;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Product {
    private String id;

    @NotBlank(message = "This name cannot be blank")
    @Size(min=2,message = "The name of the product is too short")
    private String name;

    @NotBlank(message = "The description cannot be blank")
    @Size(min=2,max=225,message = "The description must be of 2 - 255 characters")
    private String description;

    @NotNull()
    private double price;

    @NotBlank
    private String userId;




}
