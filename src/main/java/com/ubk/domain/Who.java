package com.ubk.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
@Data
public class Who {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String Name;

    @OneToMany(mappedBy = "who")
    private List<MoneyMovement> moneyMovements;

    private Who() {
    }

    public Who(String first) {
        this.setName(first);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Who{" + "id=" + id + ", Name='" + Name + '}';
    }
}

