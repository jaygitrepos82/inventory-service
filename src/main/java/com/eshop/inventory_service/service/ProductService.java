package com.eshop.inventory_service.service;

import com.eshop.inventory_service.entity.Product;
import com.eshop.inventory_service.repository.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository productRepository;

    // Create or Update Product
    public Product saveProduct(Product product) {
        logger.info("Saving product: {}", product.getName());
        return productRepository.save(product);
    }

    // Get All Products
    public List<Product> getAllProducts() {
        logger.info("Fetching all products");
        return productRepository.findAll();
    }

    // Get Product by ID
    public Optional<Product> getProductById(Long productId) {
        logger.info("Getting product:" + productId);
        return productRepository.findById(productId);
    }

    // Delete Product
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    // Additional logic using Java 8 and 11 features

    // Example: Using Stream API to filter products with stock > 0
    public List<Product> getAvailableProducts() {
        return productRepository.findAll().stream()
                .filter(product -> product.getStockQuantity() > 0)
                .collect(java.util.stream.Collectors.toList());
    }
}