package assignment;

public class HarmonicNumber {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HarmonicNumber <N>");
            return;
        }
        int N = Integer.parseInt(args[0]);
        if (N == 0) {
            System.out.println("N must be a non-zero positive integer");
            return;
        }
        double harmonic = 0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }
        System.out.println("The " + N + "th harmonic number is " + harmonic);
    }
}
