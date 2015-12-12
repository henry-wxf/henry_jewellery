package com.henry.jewellery.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.henry.jewellery.domain.Offer;
import com.henry.jewellery.domain.OfferRepository;

@RestController
@RequestMapping("/offers")
public class OfferController {
    
  private final OfferRepository repository;

  @Autowired
  public OfferController(OfferRepository repository) {
      this.repository = repository;
  }

  @RequestMapping(method=RequestMethod.GET)
  public List<Offer> getOffers() {
      return repository.findAll();
  }
  
  @RequestMapping(value = "/{offerId}", method = RequestMethod.GET)
  public Offer getOffer(@PathVariable String offerId) {
      return repository.findOne(offerId);
  }
}
