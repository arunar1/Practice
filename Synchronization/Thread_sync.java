import java.io.*;

class Example{
    synchronized static void display(){
        Thread t= Thread.currentThread();
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(100);
                System.out.println(t.getName()+" "+i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
}

class T extends Thread{
   
    // T(Example e){
    //     this.e=e;
    // }
    public void run(){
        Example.display();
    }
}

public class Thread_sync {
    public static void main(String[] args) {
        Example ex= new Example();
        T t1= new T();
        T t2=new T();
        T t3=new T();
        t1.start();
        t2.start();
        t3.start();
    }
    
}
