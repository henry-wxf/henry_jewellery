package com.henry.jewellery.service;

import java.util.List;

import com.henry.jewellery.domain.model.Offer;

public interface OfferService {
    List<Offer> getAllOffers();
    Offer getOfferById(String offerId);
    Offer save(Offer offer);
}
