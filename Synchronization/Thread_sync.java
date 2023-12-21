import java.io.*;

class Example{
    void display(){
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
    Example e;
    T(Example e){
        this.e=e;
    }
    public void run(){
        e.display();
    }
}

public class Thread_sync {
    public static void main(String[] args) {
        Example ex= new Example();
        T t1= new T(ex);
        T t2=new T(ex);
        T t3=new T(ex);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
