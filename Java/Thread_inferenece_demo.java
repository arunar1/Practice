import java.util.*;

class single implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}

public class Thread_inferenece_demo {
    public static void main(String[] args) {
        single s =new single();
        Thread t= new Thread(s);
        t.start();
        
    }
    
}
