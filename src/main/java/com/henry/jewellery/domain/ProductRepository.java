package com.henry.jewellery.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTypeAndActiveTrue(ProductType type);
    List<Product> findByActiveTrue();
}