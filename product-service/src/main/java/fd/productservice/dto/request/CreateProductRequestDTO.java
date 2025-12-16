package fd.productservice.dto.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductRequestDTO {

    @NotBlank(message="Name can not be blank")
    @Size(min=2, max=100, message = "Name must be between 2 and 100 characters")
    private String name;

    @Size(max = 1000, message = "Description max 1000 characters")
    private String description;

    @NotNull(message = "Price cannot be null")
    @Positive(message = "Price must be positive")
    @DecimalMin(value = "0.01", message = "Price must be at least 0.01")
    private BigDecimal price;

    @NotNull(message = "Stock cannot be null")
    @Min(value = 0, message = "Stock cannot be negative")
    private Integer stock;

    @NotBlank(message = "Category cannot be blank")
    @Size(max = 30, message = "Category max 30 characters")
    private String category;

    @NotEmpty(message="Brand can not be empty")
    @Size(max = 100, message = "Brand max 100 characters")
    private String brand;
}
