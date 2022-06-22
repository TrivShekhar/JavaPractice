public class SimpleInterest {
    public static void main(String[] args){
        int p,r,t;
        p=Integer.parseInt(args[0]);
        r=Integer.parseInt(args[1]);
        t=Integer.parseInt(args[2]);
        System.out.println("Simple Interest: " + (p*r*t)/100);
    }    
}
