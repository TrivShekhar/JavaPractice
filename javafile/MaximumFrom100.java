package javafile;

import java.util.Scanner;

public class MaximumFrom100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the 100 numbers");
        for(int i=0; i<100;i++){
            arr[i]= scanner.nextInt();
        }
        scanner.close();
        System.out.println("The Maximum number From 100:"+ findmax(arr));
    }
    static int findmax(int[] arr){
        int max=-99999;
        for(int a : arr){
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}
