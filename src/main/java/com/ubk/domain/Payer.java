package com.ubk.domain;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
public class Payer {

    private Long id;
    private String firstName;
    private String lastName;

    //posts

    private Payer(){

    }

    public Payer(String first, String last) {
        this.setFirstName(first);
        this.setLastName(last);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

