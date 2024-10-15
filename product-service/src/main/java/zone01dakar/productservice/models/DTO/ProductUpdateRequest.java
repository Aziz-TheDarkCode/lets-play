package zone01dakar.productservice.models.DTO;

public class ProductUpdateRequest {
    private String name;
    private String description;
    private Double price;

    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
}
