package lk.sandun.ee.ejb.remote;

import jakarta.ejb.Remote;
import lk.sandun.ee.core.model.Product;

import java.util.List;

@Remote
public interface ProductService {
    Product getProductById(int id);
    List<Product> getAllProducts();
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
