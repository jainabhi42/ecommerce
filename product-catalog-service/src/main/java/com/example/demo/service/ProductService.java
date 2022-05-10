package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public List<Product> getAllProduct();
    public List<Product> getAllProductByCategory(String category);
    public Optional<Product> getProductById(Long id);
    public List<Product> getAllProductsByName(String name);
    public Product addProduct(Product product);
    public void deleteProduct(Long productId);

}
