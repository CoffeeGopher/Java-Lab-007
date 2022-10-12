import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Give me some whole numbers:");
        while(true) {
            try {
                int input = s.nextInt();

                if (input % 2 == 0) evenCount++;
                else oddCount++;

            } catch (InputMismatchException e) {
                break;
            }
        }
        s.next();
        System.out.println("Even #s: " + evenCount);
        System.out.println("Odd #s: " + oddCount);
    }

    public static void mean() {
        int count = 0;
        int sum = 0;
        System.out.println("Give me some MORE whole numbers:");
        while(true) {
            try {
                int input = s.nextInt();

                sum += input;
                count++;

            } catch (InputMismatchException e) {
                break;
            }
        }
        System.out.println("Mean of #s given: " + ((double) sum / count));
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
