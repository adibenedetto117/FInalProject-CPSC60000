/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreterexample;

/**
 *
 * @author Lohith
 */
public class NavigateToLocationExpression implements Expression {
    private String location;

    public NavigateToLocationExpression(String location) {
        this.location = location;
    }

    @Override
    public void interpret(DeliveryContext context) {
        System.out.println("Navigating to " + location);
    }
    
}
