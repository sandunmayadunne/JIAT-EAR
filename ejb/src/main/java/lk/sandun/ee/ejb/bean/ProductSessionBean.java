package lk.sandun.ee.ejb.bean;

import jakarta.ejb.Stateless;
import lk.sandun.ee.core.model.Product;
import lk.sandun.ee.ejb.remote.ProductService;

import java.util.List;

@Stateless
public class ProductSessionBean implements ProductService {
    @Override
    public Product getProductById(int id) {
        return new Product(1,"Test Product","Test Description",1000.00,5);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1,"Test Product","Test Description",1000.00,5),
                new Product(2,"Test Product 2","Test Description",2000.00,7),
                new Product(3,"Test Product 3","Test Description",4000.00,6)
        );
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }
}
