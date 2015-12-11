package com.henry.jewellery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.henry.jewellery.domain.Offer;
import com.henry.jewellery.domain.OfferRepository;

@SpringBootApplication
public class HenryJewelleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HenryJewelleryApplication.class, args);
    }
    
    @Bean
    CommandLineRunner init(OfferRepository offerRepository) {
        return (evt) -> 
        {
            offerRepository.save(new Offer("1001", "BUILD YOUR OWN PENDANT", "components/offer/img/1001.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1002", "BUILD YOUR OWN RING", "components/offer/img/1002.jpg", "Uniquely designed engagement rings custom crafted with certified diamonds."));
            offerRepository.save(new Offer("1003", "BUILD YOUR OWN EARRINGS", "components/offer/img/1003.jpg", "Make a big impression with perfectly matched diamonds in timeless custom earrings."));
            offerRepository.save(new Offer("1004", "BUILD YOUR OWN PENDANT", "components/offer/img/1004.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1005", "BUILD YOUR OWN RING", "components/offer/img/1005.jpg", "Buy 50 mobiles and get a gift card"));
            offerRepository.save(new Offer("1006", "BUILD YOUR OWN PENDANT", "components/offer/img/1006.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1007", "BUILD YOUR OWN PENDANT", "components/offer/img/1007.jpg", "Buy 50 mobiles and get a gift card"));
            offerRepository.save(new Offer("1008", "BUILD YOUR OWN EARRINGS", "components/offer/img/1008.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1009", "BUILD YOUR OWN PENDANT", "components/offer/img/1009.jpg", "Buy 50 mobiles and get a gift card"));
            offerRepository.save(new Offer("1010", "BUILD YOUR OWN PENDANT", "components/offer/img/1010.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            
        };
    }
}
