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
        // Create a delivery context
        DeliveryContext context = new DeliveryContext();

        // Prompt the user for delivery instructions
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter delivery instructions: ");
        String input = scanner.nextLine();

        // Define delivery instructions using the interpreter pattern based on user input
        Expression navigate = new NavigateToLocationExpression("Customer's Location");
        Expression deliver = new DeliverToCustomerExpression();

        DeliveryInstructionsExpression instructions = new DeliveryInstructionsExpression();
        instructions.addExpression(navigate);
        instructions.addExpression(deliver);

        // Execute the instructions in the context of a delivery
        instructions.interpret(context);
        
        // Close the scanner
        scanner.close();
    }
}
