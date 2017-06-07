package com.ubk.domain;


import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by isc-muk on 6/1/17.
 */
@Entity
@Data
public class MoneyMovement {

    @Id @GeneratedValue
    private Long id;

    @NotNull private String article;
    @NotNull private Integer amount;
    @ManyToOne private Category category;
    private String message;
    @NotNull private Date payedAt;
    @ManyToOne private Who who;

    @SuppressWarnings("unused")
    private MoneyMovement() { }

    public MoneyMovement(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "MoneyMovement [article=" + article + " was " + amount + "]";
    }
}
