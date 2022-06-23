package com.bridgelabz.BasicCoreProgram;
import java.util.Scanner;
import java.util.random.RandomGenerator;
public class FlipCoinUC1 {
    public static void main(String[] args) {
        int head = 0;
        int tails = 0;
        double randum = 0.0;
        int count = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please Enter The Number : ");
        int flip = Input.nextInt();
        while (count <= flip){
            randum = Math.random();
            System.out.println(count+ " " +randum);
            if (randum < 0.5){
                head++;
                System.out.println("Heads");
            }else {
                tails++;
                System.out.println("Tails");
            }count++;
        }
        System.out.println();
        System.out.println("Number of Heads : " +head);
        System.out.println("Number of Tails : " +tails);
        double headpercent = (double) head/flip*100;
        double tailspercent = (double) tails/flip*100;
        System.out.println("Percentage of Head : " +headpercent);
        System.out.println("Percentage of Tails : " +tailspercent);
    }
}
