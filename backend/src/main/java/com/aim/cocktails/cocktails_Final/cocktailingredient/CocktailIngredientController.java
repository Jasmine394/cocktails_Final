package com.aim.cocktails.cocktails_Final.cocktailingredient;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/api/cocktailingredient")
public class CocktailIngredientController {

    @Autowired
    private CocktailingredientRepository CocktailingredientRepository;

    @GetMapping(path = "")
    public Iterable<Cocktailingredient> getAllCocktailingredient() {
        return CocktailingredientRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Cocktailingredient getCocktailingredient(@PathVariable(value = "id") Integer id) {
        Optional<Cocktailingredient> cocktailingredient = cocktailingredientRepository.findById(id);
        return cocktailingredient.get();
    }

}
