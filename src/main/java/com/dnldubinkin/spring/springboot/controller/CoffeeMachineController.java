package com.dnldubinkin.spring.springboot.controller;

import com.dnldubinkin.spring.springboot.dto.CoffeeOrderRequest;
import com.dnldubinkin.spring.springboot.dto.RecipeDto;
import com.dnldubinkin.spring.springboot.dto.StatisticsDto;
import com.dnldubinkin.spring.springboot.entity.CoffeeRecipe;
import com.dnldubinkin.spring.springboot.service.CoffeeMachineService;
import com.dnldubinkin.spring.springboot.service.RecipeService;
import com.dnldubinkin.spring.springboot.service.StatisticsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coffee")
public class CoffeeMachineController {

    private final CoffeeMachineService coffeeMachineService;
    private final StatisticsService statisticsService;
    private final RecipeService recipeService;

    public CoffeeMachineController(CoffeeMachineService coffeeMachineService, StatisticsService statisticsService, RecipeService recipeService) {
        this.coffeeMachineService = coffeeMachineService;
        this.statisticsService = statisticsService;
        this.recipeService = recipeService;
    }

    @PostMapping("/order")
    public String orderCoffee(@RequestBody CoffeeOrderRequest request) {
        return coffeeMachineService.makeCoffee(request);
    }

    @GetMapping("/statistics")
    public StatisticsDto getStatistics() {
        return statisticsService.getStatistics();
    }


    @PostMapping("/recipes")
    public CoffeeRecipe addRecipe(@RequestBody RecipeDto recipeDto) {
        return recipeService.addRecipe(recipeDto);
    }

    @GetMapping("/recipes")
    public List<CoffeeRecipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }
}