package com.erdaldalkiran;

import java.util.Arrays;

public class Game {
    private static int numberOfGuesses = 0;

    public static void main(String[] args) {

        GameHelper gameHelper = new GameHelper();
        int firstLocation = (int) (Math.random() * 5);
        Ship ship = new Ship(Arrays.asList(firstLocation, firstLocation + 1, firstLocation + 2));
        boolean isShipAlive = true;

        while (isShipAlive) {
            int guess = gameHelper.getUserGuess();
            incrementNumberOfGuesses();

            ShotResult shotResult = ship.checkShot(guess);
            System.out.println(shotResult);
            if (shotResult == ShotResult.KILL) {
                isShipAlive = false;
                System.out.println("You took " + numberOfGuesses + " guesses");
            }
        }

    }

    private static void incrementNumberOfGuesses() {
        numberOfGuesses++;
    }
}
