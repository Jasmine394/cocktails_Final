package com.aim.cocktails.cocktails_Final.ingredient;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRespository ingredientRespository;

    @GetMapping(path = "")
    public Iterable<Ingredient> getAllIngredient() {
        return ingredientRespository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Ingredient getIngredient(@PathVariable(value = "id") Interger id) {
        Optional<Ingredient> ingredient = ingredientRespository.findById(id);

    }

    @PostMapping(path = "/")
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientRespository.save(ingredient);

    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateIngredient(@PathVariable(value = "id") Integer id,
            @RequestBody Ingredient ingredientDetails) {
        Optional<Ingredient> optionalIngredient = ingredientRespository.findById(id);
        Ingredient ingredient = optionalIngredient.get();

        ingredient.setIngredient_name(ingredientDetails.getIngredient_name());
        ingredient.setCategory(ingredientDetails.getCategory());

        ingredientRespository.save(ingredientDetails);
        return "Updated";

    }

    @DeleteMapping(path = "/{id}")
    public @RequestBody String deleteIngredient(@PathVariable(value = "id") Integer id) {
        ingredientRespository.deleteById(id);
        return "Deleted";

    }
}
