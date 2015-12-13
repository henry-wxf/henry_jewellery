package com.henry.jewellery.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="offer_id")
    private String offerId;
    
    private String description;
    
    private BigDecimal price;
    
    @ManyToOne
    private Product product;
    
    public Offer(){
        
    }


    public Offer(String description, BigDecimal price, Product product) {
        super();
        this.description = description;
        this.price = price;
        this.product = product;
    }


    public String getDescription() {
        return description;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public Product getProduct() {
        return product;
    }


    public String getOfferId() {
        return offerId;
    }


    @Override
    public String toString() {
        return "Offer [offerId=" + offerId + ", description=" + description + ", price=" + price + ", product="
                + product + "]";
    }


}
