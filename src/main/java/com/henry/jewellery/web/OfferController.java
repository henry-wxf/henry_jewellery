package com.henry.jewellery.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.henry.jewellery.domain.model.Offer;
import com.henry.jewellery.service.OfferService;

@RestController
@RequestMapping("/offers")
public class OfferController {
    
  private final OfferService service;

  @Autowired
  public OfferController(OfferService offerService) {
      this.service = offerService;
  }

  @RequestMapping(method=RequestMethod.GET)
  public List<Offer> getOffers() {
      return service.getAllOffers();
  }
  
  @RequestMapping(value = "/{offerId}", method = RequestMethod.GET)
  public Offer getOffer(@PathVariable String offerId) {
      return service.getOfferById(offerId);
  }
}
