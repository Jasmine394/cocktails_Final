package com.aim.cocktails.cocktails_Final.cocktailingredient;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/cocktailingredient")
public class CocktailIngredientController {

    @Autowired
    private CocktailingredientRepository cocktailingredientRepository;

    @GetMapping(path = "")
    public Iterable<CocktailIngredient> getAllCocktailingredient() {
        return cocktailingredientRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public CocktailIngredient getCocktailingredient(@PathVariable(value = "id") Integer id) {
        Optional<CocktailIngredient> cocktailingredient = cocktailingredientRepository.findById(id);
        return cocktailingredient.get();
    }

}
