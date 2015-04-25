package com.erdaldalkiran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public int getUserGuess() {
        String inputLine = null;

        System.out.println("Please enter your guess");

        try {
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
            inputLine = inputStream.readLine();
            if (inputLine.length() == 0) {
                return Integer.MAX_VALUE;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(inputLine);
    }
}
