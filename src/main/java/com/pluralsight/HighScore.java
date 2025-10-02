package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class HighScore {
    public static Scanner score = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input team names (Home:Visitor | homeScore : vistScore");

        String gameResults = score.nextLine(); // holds user input
        String[] sides = gameResults.split("\\|"); // turns input to an array, index divided by |

        String[] teamNames = sides[0].split(":"); // Splits left side of input
        String homeTeam = teamNames[0];  // index 0 is home tema
        String visitorTeam = teamNames[1]; // index 1 is visitor team

        String[] scores = sides[1].split(":"); // Splits right side of input
        int homeScore = Integer.parseInt(scores[0]);
        int vistScore = Integer.parseInt(scores[1]);

        if (homeScore > vistScore) {
            System.out.println("Winner: " + homeTeam);
        }
        else {
            System.out.println("Winner: " + visitorTeam);
        }



    }

}
