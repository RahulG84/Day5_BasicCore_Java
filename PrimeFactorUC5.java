package com.bridgelabz.BasicCoreProgram;
import java.util.Scanner;
public class PrimeFactorUC5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = Input.nextInt();
        for (int i=2; i<n; i++){
            while (n % i == 0){
                n = n/i;
                System.out.println(i);
            }
        }
        if (n != 1){
            System.out.println(n);
        }
    }
}
