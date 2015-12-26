package com.henry.jewellery.domain.repository;

import java.util.List;

import com.henry.jewellery.domain.model.Product;
import com.henry.jewellery.domain.model.ProductType;

public interface ProductRepository {
    Product findOne(Long id);
    List<Product> findByTypeAndSpecialFalse(ProductType type);
    List<Product> findBySpecialFalse();
    Product save(Product product);
}
