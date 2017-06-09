package com.ubk.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by isc-muk on 6/6/17.
 */
@Entity
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    @OneToMany(mappedBy = "category")
    private List<MoneyMovement> moneyMovements;

    private Category() {
    }

    public Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
