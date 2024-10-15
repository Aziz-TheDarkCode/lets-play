package zone01dakar.productservice.models.DTO;

import lombok.Data;

@Data
public class ProductUpdateRequest {
    private String name;
    private String description;
    private Double price;

}
