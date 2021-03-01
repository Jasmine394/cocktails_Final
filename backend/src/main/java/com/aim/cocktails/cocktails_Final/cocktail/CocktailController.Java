package com.aim.cocktails.cocktails_Final.cocktail;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/cocktails")
public class CocktailController {

    @Autowired
    private CocktailRepository cocktailRepository;

    @GetMapping(path = "")
    public Iterable<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }
    
    @PutMapping(path = "/{id}")
    public @ResponseBody String updateCocktail(@PathVariable(value = "id") Integer id,
           @RequestBody Cocktail cocktailDetails) {

        Optional<Cocktail> optionalCocktail = cocktailRepository.findById(id);
        Cocktail cocktail = optionalCocktail.get();
        
        cocktail.setCocktail_name(cocktailDetails.getCocktail_name());
        cocktail.setInstructions(cocktailDetails.getInstructions());
        cocktail.setDrink_thumb(cocktailDetails.getDrink_thumb());

        cocktailRepository.save(cocktailDetails);
        return "Updated";


    }
    @DeleteMapping(path = "/{id}")
    public @ResponseBody String deleteCocktail(@PathVariable(value = "id") Integer id) {
        cocktailRepository.deleteById(id);
        return "Deleted";
    }
}
