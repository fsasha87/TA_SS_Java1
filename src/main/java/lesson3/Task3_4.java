package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3_4 {
    static ArrayList<Integer> fibN;

    public static void printFibonachi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of Fibonaci size");
        int n = sc.nextInt();
        ArrayList<Integer> fibN = new ArrayList<Integer>(Arrays.asList(0, 1));
        for (int i = 0; i < n - 2; i++) {
            int k = 0;
            k = fibN.get(i) + fibN.get(i + 1);
            fibN.add(k);
        }
        System.out.println(fibN);
    }

//    static void percentFib() {
//        int oddCounter = 0;
//        int evenCounter = 0;
//        for (int i = 0; i < fibN.size(); i++) {
//            int k = fibN.get(i);
//            if (k % 2 == 1) {
//                oddCounter++;
//            } else {
//                evenCounter++;
//            }
//        }
//        System.out.println("Percent of odd numbers: " + oddCounter / fibN.size() * 100);
//        System.out.println("Percent of even numbers: " + evenCounter / fibN.size() * 100);
//    }
}
