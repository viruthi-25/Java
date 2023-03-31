class thread22 extends Thread{
    private String message;
    public thread22(final String message){
       this.message = message;
    }
    @Override
    public void run(){
      System.out.println(message);
    }
}
public class thread2{
    public static void main(String[] args){
       String[] messages = new String[]{"Java", "J2EEE", "Spring","Struts"};       for(final String message: messages){
         new thread22(message).start();
       }
    }
}
