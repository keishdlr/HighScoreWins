package com.pluralsight;

import java.util.Scanner;

public class HighScore {
    public static Scanner score = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input team names (Home:Visitor | homeScore : vistScore");

        String input = score.nextLine(); // holds user input

        String[] sides = input.split("|"); // Splits the input into left and right side
        String leftSide = sides[0];
        String rightSide = sides[1];


        String[] teamNames = leftSide.split(":"); // Splits left side of input
        String homeTeam = teamNames[0];  // index 0 is home tema
        String visitorTeam = teamNames[1]; // index 1 is visitor team

        String[] Scores = input.split(":"); // Splits right side of input
        int homeScore = Integer.parseInt(teamNames[0]);
        int vistScore = Integer.parseInt(teamNames[1]);

        if (homeScore >vistScore) {
            System.out.println("Winner: " + homeTeam);
        }
        else {
            System.out.println("Winner: " + visitorTeam);
        }



    }

}
