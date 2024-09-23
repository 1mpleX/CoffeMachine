package com.dnldubinkin.spring.springboot.exception;

public class CoffeeMachineException extends RuntimeException {

    public CoffeeMachineException(String message) {
        super(message);
    }
}