public class Threadex extends Thread {
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println(i);
           try{
               sleep(1000);
            }
           catch(Throwable e){

           }
        }
    }
    public static void main(String[] arg){
        Threadex t = new Threadex();
        Threadex t2 = new Threadex();
        t.start();
        t2.start();

        
    }
}
