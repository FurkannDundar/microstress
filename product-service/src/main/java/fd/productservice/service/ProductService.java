package fd.productservice.service;

import fd.productservice.dto.request.*;
import fd.productservice.dto.response.ProductDTO;
import fd.productservice.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    ProductDTO createProduct(CreateProductRequestDTO createProductRequestDTO);

    ProductDTO getProductById(Long id);

    void deleteProductById(Long id);

    ProductDTO updateProduct(UpdateProductRequestDTO updateProductRequestDTO);

    boolean checkStockAvailability(StockAvailableRequestDTO stockAvailableRequestDTO);

    ProductDTO activateProduct(Long id);

    ProductDTO deactivateProduct(Long id);

    List<ProductDTO> getProductsByCategory(String category);

    List<ProductDTO> searchProducts(SearchProductsRequestDTO searchProductsRequestDTO);

    ProductDTO updateStock(UpdateStockRequestDTO updateStockRequestDTO);
}


