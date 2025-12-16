package fd.productservice.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SearchProductsRequestDTO {

    @Size(min=2, max=100, message = "Name must be between 2 and 100 characters")
    private String name;

    @Positive(message = "Price must be positive")
    @DecimalMin(value = "0.01", message = "Price must be at least 0.01")
    private BigDecimal minPrice;

    @Positive(message = "Price must be positive")
    @DecimalMin(value = "0.01", message = "Price must be at least 0.01")
    private BigDecimal maxPrice;

    private Boolean stock;

    @Size(max = 30, message = "Category max 30 characters")
    private String category;

    @Size(max = 100, message = "Brand max 100 characters")
    private String brand;
}
