/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreterexample;

/**
 *
 * @author Lohith
 */
public class DeliverToCustomerExpression implements Expression {
    public void interpret(DeliveryContext context) {
        System.out.println("Delivering the order to the customer.");
    }
}
