/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreterexample;

/**
 *
 * @author anthonydibenedetto
 */
public class DeliveryMethodExpression implements Expression {
    private String method;

    public DeliveryMethodExpression(String method) {
        this.method = method;
    }

    @Override
    public void interpret(DeliveryContext context) {
        System.out.println(method);
    }
}



