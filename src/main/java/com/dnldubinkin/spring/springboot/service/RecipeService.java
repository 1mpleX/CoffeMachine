package com.dnldubinkin.spring.springboot.service;

import com.dnldubinkin.spring.springboot.dto.RecipeDto;
import com.dnldubinkin.spring.springboot.entity.CoffeeRecipe;
import com.dnldubinkin.spring.springboot.repository.CoffeeRecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private final CoffeeRecipeRepository coffeeRecipeRepository;

    public RecipeService(CoffeeRecipeRepository coffeeRecipeRepository) {
        this.coffeeRecipeRepository = coffeeRecipeRepository;
    }

    public CoffeeRecipe addRecipe(RecipeDto recipeDto) {
        CoffeeRecipe recipe = new CoffeeRecipe(
                recipeDto.getName(),
                recipeDto.getWater(),
                recipeDto.getCoffeeBeans(),
                recipeDto.getMilk()
        );
        return coffeeRecipeRepository.save(recipe);
    }

    public List<CoffeeRecipe> getAllRecipes() {
        return coffeeRecipeRepository.findAll();
    }

    public Optional<CoffeeRecipe> findRecipeByName(String name) {
        return coffeeRecipeRepository.findAll()
                .stream()
                .filter(recipe -> recipe.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}