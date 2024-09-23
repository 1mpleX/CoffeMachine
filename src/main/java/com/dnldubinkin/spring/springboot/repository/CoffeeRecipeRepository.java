package com.dnldubinkin.spring.springboot.repository;

import com.dnldubinkin.spring.springboot.entity.CoffeeRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRecipeRepository extends JpaRepository<CoffeeRecipe, Long> {
}