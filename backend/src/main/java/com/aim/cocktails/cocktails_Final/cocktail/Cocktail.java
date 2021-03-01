package com.aim.backend.cocktails_Final.cocktails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cocktails")
public class Cocktail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cocktail_id")

    private Integer id;
    private String cocktail_name;
    private String instructions;
    private String drink_thumb;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCocktail_name() {
        return cocktail_name;
    }

    public void setCocktail_name(String cocktail_name) {
        this.cocktail_name = cocktail_name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getDrink_thumb() {
        return drink_thumb;
    }

    public void setDrink_thumb(String drink_thumb) {
        this.drink_thumb = drink_thumb;
    }

}
