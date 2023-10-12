/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interpreterexample;

import java.util.Scanner;

/**
 *
 * @author Lohith
 */
public class InterpreterExample {

    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the food you want to order: ");
        String foodItem = scanner.nextLine();

        System.out.print("Enter delivery address: ");
        String address = scanner.nextLine();

        System.out.print("Additional delivery instructions (e.g. 'leave at door' or 'ring doorbell'): ");
        String deliveryMethod = scanner.nextLine();

        Expression foodOrder = new FoodOrderExpression(foodItem);
        Expression navigate = new NavigateToLocationExpression(address);
        Expression deliverMethod = new DeliveryMethodExpression(deliveryMethod);

        DeliveryInstructionsExpression instructions = new DeliveryInstructionsExpression();
        instructions.addExpression(foodOrder);
        instructions.addExpression(navigate);
        instructions.addExpression(deliverMethod);

        instructions.interpret(context);

        scanner.close();
    }

}
