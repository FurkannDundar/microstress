package fd.productservice.service.implementation;

import fd.productservice.dto.request.*;
import fd.productservice.dto.response.ProductDTO;
import fd.productservice.entity.Product;
import fd.productservice.mapper.ProductDTOProductMapper;
import fd.productservice.repository.ProductRepository;
import fd.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImplementation implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for(int i = 0 ; i < products.size() ; i++) {
            ProductDTO productDTO = ProductDTOProductMapper
                    .mapToProductDTO(products.get(i));
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }

    @Override
    public ProductDTO createProduct(CreateProductRequestDTO createProductRequestDTO) {
        return null;
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return null;
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public ProductDTO updateProduct(UpdateProductRequestDTO updateProductRequestDTO) {
        return null;
    }

    @Override
    public boolean checkStockAvailability(StockAvailableRequestDTO stockAvailableRequestDTO) {
        return false;
    }

    @Override
    public ProductDTO activateProduct(Long id) {
        return null;
    }

    @Override
    public ProductDTO deactivateProduct(Long id) {
        return null;
    }

    @Override
    public List<ProductDTO> getProductsByCategory(String category) {
        return List.of();
    }

    @Override
    public List<ProductDTO> searchProducts(SearchProductsRequestDTO searchProductsRequestDTO) {
        return List.of();
    }

    @Override
    public ProductDTO updateStock(UpdateStockRequestDTO updateStockRequestDTO) {
        return null;
    }
}
