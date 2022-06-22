package javafile;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        System.out.println("The sum of digits of number "+a+" is "+sumOfDigits(a));
        
    }
    static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            sum= sum+ num%10;
            num= num/10;
        }
        return sum;
    }
}
