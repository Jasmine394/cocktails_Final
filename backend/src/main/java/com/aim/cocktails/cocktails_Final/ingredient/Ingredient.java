package com.aim.cocktails.cocktails_Final.ingredient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ingredient_id")

    private Integer id;

    private String ingredient_name;
    private String category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
