package com.company;

import java.util.Scanner;

public class ShowPrimeSmallerThan100 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Show prime smaller than 100");
//        int num = scanner.nextInt();
        String st = new ShowPrimeSmallerThan100().showPrime();
//        String out = "";
//        for (int i = 0; i < arr.length; i++) {
//            out += arr[i] + "\t";
//        }
        System.out.printf("the Primes smaller than 100 is: \n%s",st);
    }

    public boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String showPrime() {
//        int count = 0;
        String st = "";
        for (int i = 1; i < 100; i++) {
            boolean check = new ShowPrimeSmallerThan100().checkPrime(i);
            if (check) {
//                count++;
                st+=i+"\t";
            }
        }
        return st;
    }

}

