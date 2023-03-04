package assignment;

import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number of times to flip the coin: ");
        int numFlips = input.nextInt();
        input.close();

        // Initialize counts for heads and tails
        int numHeads = 0;
        int numTails = 0;

        // Flip the coin and count heads and tails
        Random rand = new Random();
        for (int i = 0; i < numFlips; i++) {
            if (rand.nextDouble() < 0.5) {
                numHeads++;
            } else {
                numTails++;
            }
        }

        // Calculate percentages
        double pctHeads = (numHeads * 100.0) / numFlips;
        double pctTails = (numTails * 100.0) / numFlips;

        // Print the results
        System.out.printf("Percentage of heads: %.2f%%\n", pctHeads);
        System.out.printf("Percentage of tails: %.2f%%\n", pctTails);
    }
}

