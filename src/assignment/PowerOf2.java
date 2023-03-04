package assignment;

public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <N>");
            return;
        }
        int N = Integer.parseInt(args[0]);
        if (N < 0 || N >= 31) {
            System.out.println("N must be between 0 and 30");
            return;
        }
        int power = 1;
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
