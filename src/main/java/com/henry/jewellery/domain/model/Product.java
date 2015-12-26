package com.henry.jewellery.domain.model;

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
    private Long productId;
    
    private String name;
    
    @Enumerated(EnumType.STRING)
    private ProductType type;
    
    private String description;
    
    @Column(name="img_url")
    private String imgUrl;
    
    private BigDecimal price;
    
    private boolean special;

    public Product() {
        super();
    }

    public Product(String name, ProductType type, String description, String imgUrl, BigDecimal price) {
        this(name, type, description, imgUrl, price, false);
    }
    public Product(String name, ProductType type, String description, String imgUrl, BigDecimal price, boolean special) {
        super();
        this.name = name;
        this.type = type;
        this.description = description;
        this.imgUrl = imgUrl;
        this.price = price;
        this.special = special;
    }

    public Long getProductId() {
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

    public boolean isSpecial() {
        return special;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", type=" + type + ", description=" + description
                + ", imgUrl=" + imgUrl + ", price=" + price + ", special=" + special + "]";
    }
}
