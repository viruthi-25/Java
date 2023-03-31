public class oneThread extends Thread {
public void run()
    {
 try {
Thread.sleep(300);
        }
 catch (InterruptedException ie) {
        }
}
 public static void main(String[] args) throws InterruptedException
    {
    oneThread c1 = new oneThread();
        oneThread c2 = new oneThread();
c1.start();
 System.out.println(c1.isAlive());
         System.out.println("Thread 1 is alive");
c1.join();
         System.out.println("After thread 1 dies");
         System.out.println(c1.isAlive());
        c2.start();
         System.out.println("Thread 2 is alive");

        System.out.println(c2.isAlive());
        c2.join();
        System.out.println("After thread 2 dies");
         System.out.println(c2.isAlive());
    }
}
