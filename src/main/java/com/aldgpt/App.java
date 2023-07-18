package com.aldgpt;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            String prompt = "Write a Java class to find the factorial of a number.";
            String response = GPTClient.getChatGptResponse(prompt);
            System.out.println("ChatGPT Response:\n" + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
