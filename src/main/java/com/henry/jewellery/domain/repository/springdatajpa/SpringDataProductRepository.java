package com.henry.jewellery.domain.repository.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henry.jewellery.domain.model.Product;
import com.henry.jewellery.domain.repository.ProductRepository;

@Profile("spring-data-jpa")
@Repository
public interface SpringDataProductRepository extends ProductRepository, JpaRepository<Product, Long> {

}
