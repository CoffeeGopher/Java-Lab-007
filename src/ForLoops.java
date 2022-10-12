import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Number? ");
        int n = s.nextInt();
        if (n < 1) {
            System.err.println("Error: Number must be at least 1");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        System.out.print("Number? ");
        int n = s.nextInt();
        if (n < 1) {
            System.err.println("Error: Number must be at least 1");
            return;
        }
        System.out.print("Number? ");
        int n2 = s.nextInt();
        if (n2 < 1) {
            System.err.println("Error: Number must be at least 1");
            return;
        }
        int sum = 0;
        // im lazy, which is why this solution is perfect)
        for(int i = Math.min(n, n2); i <= Math.max(n, n2); i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void factorial() {
        System.out.print("Number? ");
        int n = s.nextInt();
        if (n < 1) {
            System.err.println("Error: Number must be at least 1");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
