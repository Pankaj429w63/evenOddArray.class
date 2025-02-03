import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArrays {
    public static void main(String[] args) {
        // Try-with-resources ensures the scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    even.add(num);
                } else {
                    odd.add(num);
                }
            }
            
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
        } // Scanner will be closed automatically here
    }
}
