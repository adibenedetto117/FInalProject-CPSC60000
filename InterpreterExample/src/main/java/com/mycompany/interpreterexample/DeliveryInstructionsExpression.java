/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreterexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lohith
 */
public class DeliveryInstructionsExpression implements Expression {
     private List<Expression> instructions = new ArrayList<>();

    public void addExpression(Expression expression) {
        instructions.add(expression);
    }

    public void interpret(DeliveryContext context) {
        for (Expression expression : instructions) {
            expression.interpret(context);
        }
    }
}
