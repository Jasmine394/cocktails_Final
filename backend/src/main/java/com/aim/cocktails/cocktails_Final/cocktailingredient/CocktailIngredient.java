package com.aim.cocktails.cocktails_Final.cocktailingredient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aim.cocktails.cocktails_Final.cocktail.Cocktail;
import com.aim.cocktails.cocktails_Final.ingredient.Ingredient;

@Entity
@Table(name = "cocktailingredient")
public class CocktailIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cocktailingredient")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cocktail_id")
    private Cocktail cocktail;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

}
