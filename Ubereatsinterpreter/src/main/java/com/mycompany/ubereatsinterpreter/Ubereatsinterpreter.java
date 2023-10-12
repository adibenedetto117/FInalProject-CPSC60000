/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ubereatsinterpreter;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anthonydibenedetto
 */
public class Ubereatsinterpreter {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your command: ");
        String input = scanner.nextLine();

        Map<String, String> tokenizedInput = Tokenizer.tokenize(input);
        
        DeliveryContext context = new DeliveryContext();

        StringBuilder driverMessage = new StringBuilder("Delivery Instructions:\n");

        for (Map.Entry<String, String> entry : tokenizedInput.entrySet()) {
            String messagePart = null;

            switch (entry.getKey()) {
                case "order":
                    messagePart = "Pick up " + entry.getValue() + " for delivery.";
                    break;
                case "address":
                    messagePart = "Delivery address: " + entry.getValue();
                    break;
                case "method":
                    messagePart = "Special instructions: " + entry.getValue();
                    break;
                default:
                    continue;
            }

            driverMessage.append(messagePart).append("\n");
        }

        System.out.println(driverMessage.toString());
        
        scanner.close();
    }
}