package javafile;
import java.util.Scanner;
public class BinaryAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary numbers");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        scanner.close();
        System.out.println(sum(s1,s2));
    }
    static String sum(String s1, String s2){
        int a = Integer.parseInt(s1,2);
        int b = Integer.parseInt(s2, 2);
        int c = a+b;
        return Integer.toBinaryString(c);
    }
}
