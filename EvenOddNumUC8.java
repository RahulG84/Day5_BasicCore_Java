package com.bridgelabz.BasicCoreProgram;
import java.util.Scanner;
public class EvenOddNumUC8 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int R = Input.nextInt();
        if (R % 2 == 0){
            System.out.println("Entered Number is Even");
        }else {
            System.out.println("Enter Number is add");
        }
    }
}
