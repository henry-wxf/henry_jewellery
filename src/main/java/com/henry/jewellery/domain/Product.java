package com.henry.jewellery.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="product_id")
    private String productId;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private ProductType type;
    
    private String description;
    
    @Column(name="img_url")
    private String imgUrl;
    
    private BigDecimal price;

    public Product() {
        super();
    }

    public Product(String name, ProductType type, String description, String imgUrl, BigDecimal price) {
        super();
        this.name = name;
        this.type = type;
        this.description = description;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", type=" + type + ", description=" + description
                + ", imgUrl=" + imgUrl + ", price=" + price + "]";
    }

}
