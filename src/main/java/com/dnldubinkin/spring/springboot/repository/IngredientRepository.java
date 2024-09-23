package com.dnldubinkin.spring.springboot.repository;

import com.dnldubinkin.spring.springboot.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}