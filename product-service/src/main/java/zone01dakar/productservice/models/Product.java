package zone01dakar.productservice.models;
import jakarta.validation.constraints.*;

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

    // Constructor
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
