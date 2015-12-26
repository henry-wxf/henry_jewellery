package com.henry.jewellery.domain.repository.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henry.jewellery.domain.model.Offer;
import com.henry.jewellery.domain.repository.OfferRepository;

@Profile("spring-data-jpa")
@Repository
public interface SpringDataOfferRepository extends OfferRepository, JpaRepository<Offer, String> {

}
