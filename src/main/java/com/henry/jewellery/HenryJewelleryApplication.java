package com.henry.jewellery;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.henry.jewellery.domain.Offer;
import com.henry.jewellery.domain.OfferRepository;
import com.henry.jewellery.domain.Product;
import com.henry.jewellery.domain.ProductRepository;
import com.henry.jewellery.domain.ProductType;

@SpringBootApplication
public class HenryJewelleryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HenryJewelleryApplication.class, args);
    }
    
    @Bean
    CommandLineRunner init(OfferRepository offerRepository, ProductRepository productRepository) {
        return (evt) -> 
        {
            offerRepository.save(new Offer("1001", "BUILD YOUR OWN PENDANT", "img/product/1001.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1002", "BUILD YOUR OWN RING", "img/product/1002.jpg", "Uniquely designed engagement rings custom crafted with certified diamonds."));
            offerRepository.save(new Offer("1003", "BUILD YOUR OWN EARRINGS", "img/product/1003.jpg", "Make a big impression with perfectly matched diamonds in timeless custom earrings."));
            offerRepository.save(new Offer("1004", "BUILD YOUR OWN PENDANT", "img/product/1004.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1005", "BUILD YOUR OWN RING", "img/product/1005.jpg", "Buy 50 mobiles and get a gift card"));
            offerRepository.save(new Offer("1006", "BUILD YOUR OWN PENDANT", "img/product/1006.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1007", "BUILD YOUR OWN PENDANT", "img/product/1007.jpg", "Buy 50 mobiles and get a gift card"));
            offerRepository.save(new Offer("1008", "BUILD YOUR OWN EARRINGS", "img/product/1008.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            offerRepository.save(new Offer("1009", "BUILD YOUR OWN PENDANT", "img/product/1009.jpg", "Buy 50 mobiles and get a gift card"));
            offerRepository.save(new Offer("1010", "BUILD YOUR OWN PENDANT", "img/product/1010.jpg", "Unmatched diamond selection makes classic diamond pendants anything but ordinary."));
            
            productRepository.save(new Product("ASSORTED_1001", ProductType.ASSORTED, "Freshwater Pearl Necklace Bracelet and Earrings Set", "img/product/assorted_1001.jpg", new BigDecimal(99.99)));
            productRepository.save(new Product("BRACELETS_1001", ProductType.BRACELETS, "Sterling Silver Belcher Engraved Heart Padlock Bracelet", "img/product/bracelet_1001.jpg", new BigDecimal(168.88)));
            productRepository.save(new Product("CHAINS_1001", ProductType.CHAINS, "Diamond Cut Curb Gents 55cm Chain in 9ct Solid Gold", "img/product/chain_1001.jpg", new BigDecimal(268.88)));
            productRepository.save(new Product("CHARMS_1001", ProductType.CHARMS, "Amadora Assorted Glass Sterling Silver Beads (each)", "img/product/charms_1001.jpg", new BigDecimal(88.88)));
            productRepository.save(new Product("EARRINGS_1001", ProductType.EARRINGS, "Diamond Huggie Earrings in 9ct Yellow Gold (TW=5pt)", "img/product/earrings_1001.jpg", new BigDecimal(68.18)));
            productRepository.save(new Product("NECKLACES_1001", ProductType.NECKLACES, "Personalised 3-5 Cursive Letters Name Necklace in Sterling Silver", "img/product/necklace_1001.jpg", new BigDecimal(89.89)));
            productRepository.save(new Product("PENDANTS_1001", ProductType.PENDANTS, "9ct Yellow Gold Faith Hope and Charity Charm Pendant", "img/product/pendants_1001.jpg", new BigDecimal(96.00)));
            productRepository.save(new Product("RINGS_1001", ProductType.RINGS, "Diamond Bridal 2-Rings Set in 18ct Gold (TW=1.5CT)", "img/product/rings_1001.jpg", new BigDecimal(693.16)));
            
            productRepository.save(new Product("ASSORTED_1002", ProductType.ASSORTED, "Freshwater Pearl Necklace Bracelet and Earrings Set", "img/product/assorted_1002.jpg", new BigDecimal(99.99)));
            productRepository.save(new Product("BRACELETS_1002", ProductType.BRACELETS, "Sterling Silver Belcher Engraved Heart Padlock Bracelet", "img/product/bracelet_1002.jpg", new BigDecimal(168.88)));
            productRepository.save(new Product("CHAINS_1002", ProductType.CHAINS, "Diamond Cut Curb Gents 55cm Chain in 9ct Solid Gold", "img/product/chain_1002.jpg", new BigDecimal(268.88)));
            productRepository.save(new Product("CHARMS_1002", ProductType.CHARMS, "Amadora Assorted Glass Sterling Silver Beads (each)", "img/product/charms_1002.jpg", new BigDecimal(88.88)));
            productRepository.save(new Product("EARRINGS_1002", ProductType.EARRINGS, "Diamond Huggie Earrings in 9ct Yellow Gold (TW=5pt)", "img/product/earrings_1002.jpg", new BigDecimal(68.18)));
            productRepository.save(new Product("NECKLACES_1002", ProductType.NECKLACES, "Personalised 3-5 Cursive Letters Name Necklace in Sterling Silver", "img/product/necklace_1002.jpg", new BigDecimal(89.89)));
            productRepository.save(new Product("PENDANTS_1002", ProductType.PENDANTS, "9ct Yellow Gold Faith Hope and Charity Charm Pendant", "img/product/pendants_1002.jpg", new BigDecimal(96.00)));
            productRepository.save(new Product("RINGS_1002", ProductType.RINGS, "Diamond Bridal 2-Rings Set in 18ct Gold (TW=1.5CT)", "img/product/rings_1002.jpg", new BigDecimal(693.16)));
            
            productRepository.save(new Product("ASSORTED_1003", ProductType.ASSORTED, "Freshwater Pearl Necklace Bracelet and Earrings Set", "img/product/assorted_1003.jpg", new BigDecimal(99.99)));
            productRepository.save(new Product("BRACELETS_1003", ProductType.BRACELETS, "Sterling Silver Belcher Engraved Heart Padlock Bracelet", "img/product/bracelet_1003.jpg", new BigDecimal(168.88)));
            productRepository.save(new Product("CHAINS_1003", ProductType.CHAINS, "Diamond Cut Curb Gents 55cm Chain in 9ct Solid Gold", "img/product/chain_1003.jpg", new BigDecimal(268.88)));
            productRepository.save(new Product("CHARMS_1003", ProductType.CHARMS, "Amadora Assorted Glass Sterling Silver Beads (each)", "img/product/charms_1003.jpg", new BigDecimal(88.88)));
            productRepository.save(new Product("EARRINGS_1003", ProductType.EARRINGS, "Diamond Huggie Earrings in 9ct Yellow Gold (TW=5pt)", "img/product/earrings_1003.jpg", new BigDecimal(68.18)));
            productRepository.save(new Product("NECKLACES_1003", ProductType.NECKLACES, "Personalised 3-5 Cursive Letters Name Necklace in Sterling Silver", "img/product/necklace_1003.jpg", new BigDecimal(89.89)));
            productRepository.save(new Product("PENDANTS_1003", ProductType.PENDANTS, "9ct Yellow Gold Faith Hope and Charity Charm Pendant", "img/product/pendants_1003.jpg", new BigDecimal(96.00)));
            productRepository.save(new Product("RINGS_1003", ProductType.RINGS, "Diamond Bridal 2-Rings Set in 18ct Gold (TW=1.5CT)", "img/product/rings_1003.jpg", new BigDecimal(693.16)));
            
            productRepository.save(new Product("ASSORTED_1001", ProductType.ASSORTED, "Freshwater Pearl Necklace Bracelet and Earrings Set", "img/product/assorted_1001.jpg", new BigDecimal(99.99)));
            productRepository.save(new Product("BRACELETS_1001", ProductType.BRACELETS, "Sterling Silver Belcher Engraved Heart Padlock Bracelet", "img/product/bracelet_1001.jpg", new BigDecimal(168.88)));
            productRepository.save(new Product("CHAINS_1001", ProductType.CHAINS, "Diamond Cut Curb Gents 55cm Chain in 9ct Solid Gold", "img/product/chain_1001.jpg", new BigDecimal(268.88)));
            productRepository.save(new Product("CHARMS_1001", ProductType.CHARMS, "Amadora Assorted Glass Sterling Silver Beads (each)", "img/product/charms_1001.jpg", new BigDecimal(88.88)));
            productRepository.save(new Product("EARRINGS_1001", ProductType.EARRINGS, "Diamond Huggie Earrings in 9ct Yellow Gold (TW=5pt)", "img/product/earrings_1001.jpg", new BigDecimal(68.18)));
            productRepository.save(new Product("NECKLACES_1001", ProductType.NECKLACES, "Personalised 3-5 Cursive Letters Name Necklace in Sterling Silver", "img/product/necklace_1001.jpg", new BigDecimal(89.89)));
            productRepository.save(new Product("PENDANTS_1001", ProductType.PENDANTS, "9ct Yellow Gold Faith Hope and Charity Charm Pendant", "img/product/pendants_1001.jpg", new BigDecimal(96.00)));
            productRepository.save(new Product("RINGS_1001", ProductType.RINGS, "Diamond Bridal 2-Rings Set in 18ct Gold (TW=1.5CT)", "img/product/rings_1001.jpg", new BigDecimal(693.16)));
            
            productRepository.save(new Product("ASSORTED_1005", ProductType.ASSORTED, "Freshwater Pearl Necklace Bracelet and Earrings Set", "img/product/assorted_1005.jpg", new BigDecimal(99.99)));
            productRepository.save(new Product("BRACELETS_1005", ProductType.BRACELETS, "Sterling Silver Belcher Engraved Heart Padlock Bracelet", "img/product/bracelet_1005.jpg", new BigDecimal(168.88)));
            productRepository.save(new Product("CHAINS_1005", ProductType.CHAINS, "Diamond Cut Curb Gents 55cm Chain in 9ct Solid Gold", "img/product/chain_1005.jpg", new BigDecimal(268.88)));
            productRepository.save(new Product("CHARMS_1005", ProductType.CHARMS, "Amadora Assorted Glass Sterling Silver Beads (each)", "img/product/charms_1005.jpg", new BigDecimal(88.88)));
            productRepository.save(new Product("EARRINGS_1005", ProductType.EARRINGS, "Diamond Huggie Earrings in 9ct Yellow Gold (TW=5pt)", "img/product/earrings_1005.jpg", new BigDecimal(68.18)));
            productRepository.save(new Product("NECKLACES_1005", ProductType.NECKLACES, "Personalised 3-5 Cursive Letters Name Necklace in Sterling Silver", "img/product/necklace_1005.jpg", new BigDecimal(89.89)));
            productRepository.save(new Product("PENDANTS_1005", ProductType.PENDANTS, "9ct Yellow Gold Faith Hope and Charity Charm Pendant", "img/product/pendants_1005.jpg", new BigDecimal(96.00)));
            productRepository.save(new Product("RINGS_1005", ProductType.RINGS, "Diamond Bridal 2-Rings Set in 18ct Gold (TW=1.5CT)", "img/product/rings_1005.jpg", new BigDecimal(693.16)));
            
            productRepository.save(new Product("ASSORTED_1006", ProductType.ASSORTED, "Freshwater Pearl Necklace Bracelet and Earrings Set", "img/product/assorted_1006.jpg", new BigDecimal(99.99)));
            productRepository.save(new Product("BRACELETS_1006", ProductType.BRACELETS, "Sterling Silver Belcher Engraved Heart Padlock Bracelet", "img/product/bracelet_1006.jpg", new BigDecimal(168.88)));
            productRepository.save(new Product("CHAINS_1006", ProductType.CHAINS, "Diamond Cut Curb Gents 55cm Chain in 9ct Solid Gold", "img/product/chain_1006.jpg", new BigDecimal(268.88)));
            productRepository.save(new Product("CHARMS_1006", ProductType.CHARMS, "Amadora Assorted Glass Sterling Silver Beads (each)", "img/product/charms_1006.jpg", new BigDecimal(88.88)));
            productRepository.save(new Product("EARRINGS_1006", ProductType.EARRINGS, "Diamond Huggie Earrings in 9ct Yellow Gold (TW=5pt)", "img/product/earrings_1006.jpg", new BigDecimal(68.18)));
            productRepository.save(new Product("NECKLACES_1006", ProductType.NECKLACES, "Personalised 3-5 Cursive Letters Name Necklace in Sterling Silver", "img/product/necklace_1006.jpg", new BigDecimal(89.89)));
            productRepository.save(new Product("PENDANTS_1006", ProductType.PENDANTS, "9ct Yellow Gold Faith Hope and Charity Charm Pendant", "img/product/pendants_1006.jpg", new BigDecimal(96.00)));
            productRepository.save(new Product("RINGS_1006", ProductType.RINGS, "Diamond Bridal 2-Rings Set in 18ct Gold (TW=1.5CT)", "img/product/rings_1006.jpg", new BigDecimal(693.16)));
            
        };
    }
}
