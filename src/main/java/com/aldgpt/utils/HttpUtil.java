package com.aldgpt.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
    // ...

    public static String postRequest(String endpointUrl, String apiKey, String requestBody) throws IOException {
        URL url = new URL(endpointUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method and headers
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);
        connection.setDoOutput(true);

        // Write the request body
        connection.getOutputStream().write(requestBody.getBytes());

        // Read the response
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
    }
}
