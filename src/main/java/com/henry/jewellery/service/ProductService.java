package com.henry.jewellery.service;

import java.util.List;

import com.henry.jewellery.domain.model.Product;
import com.henry.jewellery.domain.model.ProductType;

public interface ProductService {
    Product getProductById(Long productId);
    List<Product> getAllProducts();
    List<Product> findProductsByType(ProductType productType);
    Product save(Product product);
}
