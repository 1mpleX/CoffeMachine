package com.dnldubinkin.spring.springboot.util;


import com.dnldubinkin.spring.springboot.entity.Ingredient;

public class IngredientValidator {

    public static boolean validateIngredient(Ingredient ingredient, int requiredAmount) {
        return ingredient.getQuantity() >= requiredAmount;
    }
}