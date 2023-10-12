/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ubereatsinterpreter;

/**
 *
 * @author anthonydibenedetto
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Tokenizer {
    public static Map<String, String> tokenize(String input) {
        Map<String, String> tokenMap = new LinkedHashMap<>(); // Use LinkedHashMap

        String[] tokens = input.split(";");
        for (String token : tokens) {
            String[] keyValue = token.trim().split(":");
            if (keyValue.length == 2) {
                tokenMap.put(keyValue[0].trim(), keyValue[1].trim());
            }
        }

        return tokenMap;
    }
}