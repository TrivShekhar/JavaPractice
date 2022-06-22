package javafile;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial");
        int n= scanner.nextInt();
        scanner.close();
        System.out.println(""+factorial(n));
        
    }
    static int factorial(int n){
        if(n<2 && n>-1){
            return 1;
        }
        else if(n>2){
            int fact=1;
            for(int i=2; i<=n;i++){
                fact*=i;
            }
            return fact;
        }
        else{
            System.out.println("No factorial of negative numbers");
            return 0;
        }
    }
}
