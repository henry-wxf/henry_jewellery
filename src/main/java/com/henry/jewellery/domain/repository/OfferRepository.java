package com.henry.jewellery.domain.repository;

import java.util.List;

import com.henry.jewellery.domain.model.Offer;

public interface OfferRepository {
    List<Offer> findAll();
    Offer findOne(String id);
    Offer save(Offer offer);
}
