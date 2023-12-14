import java.util.*;


class single extends Thread{
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println(i);
        }
    }
}


public class Thread_demo {
    public static void main(String[] args) {
        single t =new single();
        t.start();
    }
    
}
