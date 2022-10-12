import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        ArrayList<Integer> ints = new ArrayList<>();
        while(true) {
            try {
                ints.add(s.nextInt());
            } catch (InputMismatchException e) {
                break;
            }
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int n : ints) {
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even #s: " + evenCount);
        System.out.println("Odd #s: " + oddCount);
    }

    public static void mean() {
//        while() {
//            s.nextInt();
//        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
