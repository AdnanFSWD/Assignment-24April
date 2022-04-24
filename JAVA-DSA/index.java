import java.util.*;

public class index {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Program to Check if a No is Prime or Not

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");

        // Pattern 5: (Homework)
        // *
        // ***
        // *****
        // *******
        // *********

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }

            System.out.println();
        }

        System.out.println();

        // Program to input hour(24 hour format) and print
        // good morning(<12) / good afternoon(<=16)
        // / good evening(<=20) / good night.
        // HomeWork

        // int n = scn.nextInt();

        if (n < 12) {
            System.out.println("good morning");
        } else if (n <= 16) {
            System.out.println("good afternoon");
        } else if (n <= 20) {
            System.out.println("good evening");
        } else {
            System.out.println("good night");
        }

        // - WAP to count evens in array - (HomeWork)
        int arr[] = { 31, 62, 11, 17, 20, 25 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
