package com.ubk.domain;


import java.util.Date;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
public class Spending {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String body;
    private Date postedOn;
    // author

    private Spending() {
    }

    public Spending(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(String postedOn) {
        this.postedOn = postedOn;
    }

    @Override
    public String toString() {
        return "Spending [title=" + title + "]";
    }
}
