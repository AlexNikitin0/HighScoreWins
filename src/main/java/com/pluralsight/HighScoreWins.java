package com.pluralsight;
import java.util.Scanner;
public class HighScoreWins {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a game score: (home:visitor|xx:xx): ");
        String input = keyboard.nextLine(); //get user input
        String[] split = input.split("\\|");



        //String[] teamSplit = split[1].split("\\:");
        String[] teamScores = split[1].split("\\:");
        String score1 = teamScores[0];
        String score2 = teamScores[1];
        int score1int = Integer.parseInt(teamScores[0]);
        int score2int = Integer.parseInt(teamScores[1]);



        String[] teamNames = split[0].split("\\:");
        String team1 = teamNames[0];
        String team2 = teamNames[1];




        if(score1int > score2int)
        {
            System.out.println("Winner: " + teamNames[0]);
        }
        else System.out.println("Winner: " + teamNames[1]);

    }

}
