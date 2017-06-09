package com.ubk.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
@Data
public class MoneyMovement {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String article;
    @NotNull
    private Integer amount;
    @ManyToOne
    private Category category;
    private String message;
    @NotNull
    private Date payedAt;
    @ManyToOne
    private Who who;

    @SuppressWarnings("unused")
    private MoneyMovement() {
    }

    public MoneyMovement(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "MoneyMovement [article=" + article + " was " + amount + "]";
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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

    public Who getWho() {
        return who;
    }

    public void setWho(Who who) {
        this.who = who;
    }
}
