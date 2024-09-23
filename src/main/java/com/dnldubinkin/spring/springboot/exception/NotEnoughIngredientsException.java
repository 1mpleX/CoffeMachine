package com.dnldubinkin.spring.springboot.exception;

public class NotEnoughIngredientsException extends CoffeeMachineException {

    public NotEnoughIngredientsException(String message) {
        super(message);
    }
}