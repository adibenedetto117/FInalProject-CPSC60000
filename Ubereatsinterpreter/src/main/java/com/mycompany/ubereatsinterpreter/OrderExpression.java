/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ubereatsinterpreter;

/**
 *
 * @author anthonydibenedetto
 */

public class OrderExpression implements Expression {
    @Override
    public void interpret(DeliveryContext context, String value) {
        System.out.println("Ordering " + value + " for delivery.");
    }
}