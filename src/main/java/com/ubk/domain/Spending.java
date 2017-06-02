package com.ubk.domain;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
public class Spending {

    @Id
    @GeneratedValue
    private Long id;

    // what got bought, what category (optional), when did it got payed
    private String article;
    private Integer price;
    private String category;
    private String message;
    private Date payedAt;

    @ManyToOne
    private Payer payer;

    @SuppressWarnings("unused")
    private Spending() { }

    public Spending(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;

    }

    public Date getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(Date payedAt) {
        this.payedAt = payedAt;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    @Override
    public String toString() {
        return "Spending [article=" + article + " was " + price + "]";
    }
}
