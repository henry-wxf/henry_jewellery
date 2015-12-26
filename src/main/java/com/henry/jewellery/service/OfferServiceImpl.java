package com.henry.jewellery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.jewellery.domain.model.Offer;
import com.henry.jewellery.domain.repository.OfferRepository;

@Service("offerService")
public class OfferServiceImpl implements OfferService {
    private OfferRepository offerRepository;
    
    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    @Override
    public Offer getOfferById(String offerId) {
        return offerRepository.findOne(offerId);
    }

    @Override
    public Offer save(Offer offer) {
        return offerRepository.save(offer);
    }

}
