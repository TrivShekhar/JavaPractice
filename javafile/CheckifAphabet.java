package javafile;
import java.util.Scanner;

public class CheckifAphabet {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the characters to check if they are alphabet");
    char a= scanner.next().charAt(0);
    scanner.close();
    if(checkIfAphabet(a)){
        System.out.println("Is Alphabet");
    }
    else{
        System.out.println("Is not Alphabet");
    }
}
static boolean checkIfAphabet(char a){
    boolean ret=false;
    if(a>='A' && a<='Z' || a>='a' && a<='z'){
        ret=true;
    }
    return ret;
}
    
}
