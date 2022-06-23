package com.bridgelabz.BasicCoreProgram;
import java.util.Scanner;
public class PowerOf2UC3 {
    Scanner Input = new Scanner(System.in);
    int inputNumber() {
        System.out.println("Enter the number between 0 and less than 31");
        int number=Input.nextInt();
        return number;
    }
    public static void main(String[] args) {
        PowerOf2UC3 obj = new PowerOf2UC3();
        int number=obj.inputNumber();
        while(true) {
            if(number<0 || number>=31) {
                number=obj.inputNumber();
            }
            else {
                for(int i=0;i<=number;i++) {
                    System.out.println((int)Math.pow(2,(double)i));
                }
                break;
            }
        }
    }
}
