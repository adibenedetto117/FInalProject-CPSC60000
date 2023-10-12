/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreterexample;

/**
 *
 * @author anthonydibenedetto
 */
public class FoodOrderExpression implements Expression {
    private String foodItem;

    public FoodOrderExpression(String foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public void interpret(DeliveryContext context) {
        System.out.println("Ordering " + foodItem + " for delivery.");
    }
}
