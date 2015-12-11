package com.henry.jewellery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Offer {
    @Id
    @Column(name="offer_id")
    private String offerId;
    
    private String caption;
    
    @Column(name="img_url")
    private String imgUrl;
    
    private String promotion;
    
    public Offer(){
        
    }
    public Offer(String offerId, String caption, String imgUrl, String promotion) {
        super();
        this.offerId = offerId;
        this.caption = caption;
        this.imgUrl = imgUrl;
        this.promotion = promotion;
    }

    public String getOfferId() {
        return offerId;
    }

    public String getCaption() {
        return caption;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getPromotion() {
        return promotion;
    }
    @Override
    public String toString() {
        return "Offer [offerId=" + offerId + ", caption=" + caption + ", imgUrl="
                + imgUrl + ", promotion=" + promotion + "]";
    }

}
