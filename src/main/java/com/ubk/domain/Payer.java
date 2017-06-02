package com.ubk.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
public class Payer {

    @Id
    @GeneratedValue
    private Long id;

    private String Name;

    //posts
    @OneToMany(mappedBy = "payer")
    private List<Spending> spendings;

    private Payer(){

    }

    public Payer(String first) {
        this.setName(first);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Payer [Name=" + Name +"]";
    }
}

