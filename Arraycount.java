import java.util.Scanner;
public class Arraycount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] n= new int[20];
        int even=0;
        for(int i=0;i<20;i++){
            n[i]=scanner.nextInt();
        }  
        scanner.close();
        for(int i=0;i<20;i++){
            if(n[i]%2==0){
                even++;
            }
        }
        System.out.println("Even : "+even);
        System.out.println("Odd :"+(20-even));
    }
}
