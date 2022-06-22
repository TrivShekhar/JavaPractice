public class exceptionhandl {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        try{
            a=10/a;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block");
        }
        
    }
}
