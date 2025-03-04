package com.ecom.store.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // API service to display all the products
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    // API service to add products
    public void addProducts(Product product) {
        productRepository.save(product);
    }

    // API service for deleting a product
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
