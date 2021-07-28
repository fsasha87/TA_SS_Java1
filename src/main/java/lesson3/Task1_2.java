package lesson3;

import java.util.Scanner;

public class Task1_2 {

    public static void sumOddNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1 = sc.nextInt();
        System.out.println("Please enter greater number");
        int number2 = sc.nextInt();
        if (number1 > number2) {
            System.out.println("Enter greater number than " + number1);
            number2 = sc.nextInt();
        }
        int oddSum = 0;
        int evenSum = 0;
        for (int i = number1; i < number2; i++) {
            if (i % 2 == 1) {
                oddSum = i + oddSum;
            } else {
                evenSum = i + evenSum;
            }
        }
        System.out.println("Odd number's sum = " + oddSum);
        System.out.println("Even number's sum = " + evenSum);
    }


}
