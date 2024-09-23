package com.dnldubinkin.spring.springboot.service;

import com.dnldubinkin.spring.springboot.dto.CoffeeOrderRequest;
import com.dnldubinkin.spring.springboot.exception.NotEnoughIngredientsException;
import com.dnldubinkin.spring.springboot.repository.IngredientRepository;
import org.springframework.stereotype.Service;

@Service
public class CoffeeMachineService {

    private final IngredientRepository ingredientRepository;

    public CoffeeMachineService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public String makeCoffee(CoffeeOrderRequest request) {

        if (!checkIngredients(request)) {
            throw new NotEnoughIngredientsException("Недостаточно ингредиентов для приготовления напитка");
        }

        return "Ваш " + request.getCoffeeType() + " готов!";
    }

    private boolean checkIngredients(CoffeeOrderRequest request) {

        return true;
    }
}