package CH03;

import java.util.Scanner;
import java.text.DecimalFormat;

/*
Write a program that calculates the total grade for N classroom exercises
as a percentage. Use the DecimalFormat class to output the value as a percent.
The user should input the value for N followed by each of the N scores and totals. Calculate
the overall percentage (sum of the total points earned divided by the total points
possible) and output it using the DecimalFormat class.
 */

public class Exercise3_9 {
    public static void main(String[] args) {

        //Create Scanner class
        Scanner input = new Scanner(System.in);

        //Create decimal format
        DecimalFormat decimalFormat = new DecimalFormat("00.00%");

        int number, score, possiblePoints, totalPossiblePoints = 0,
                percent = 0, totalScores = 0;

        //Input the number of exercises
        System.out.print("Number of Exercises: ");
        number = input.nextInt();

        for (int counter = 1; counter <= number; counter++){

            //input the scores for each of N score
            System.out.print("Score for exercise " + counter + ": ");
            score = input.nextInt();

            //Input the Possible Points
            System.out.print("Total points for exercise " + counter  + ": ");
            possiblePoints = input.nextInt();

            //Total
            //Total score for all exercises
            totalScores += score;

            //Total possible points from all exercises
            totalPossiblePoints += possiblePoints;
        }
        System.out.println("Your total is " + totalScores +
                " out of " + totalPossiblePoints + ", or " +
                decimalFormat.format((double)totalScores / totalPossiblePoints));
    }
}
