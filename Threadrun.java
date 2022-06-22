public class Threadrun implements Runnable {
    public void run(){
     for(int i =0; i<10;i++){
        System.out.println(i);
     }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new Threadrun());
        t.start();
    }
}
