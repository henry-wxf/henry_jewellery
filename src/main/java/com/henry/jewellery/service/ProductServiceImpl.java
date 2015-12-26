package com.henry.jewellery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.jewellery.domain.model.Product;
import com.henry.jewellery.domain.model.ProductType;
import com.henry.jewellery.domain.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findOne(productId);
    }

    @Override
    public List<Product> findProductsByType(ProductType productType) {
        return productRepository.findByTypeAndSpecialFalse(productType);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findBySpecialFalse();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
