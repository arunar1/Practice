class th  extends Thread{
    public void run(){
        Thread t=currentThread();
        for(int i=0;i<10;i++){
            try {
                t.sleep(100);                
            } catch (Exception e) {
               System.out.println(e);
            }
            System.out.println(i);
        }

    }
}

class method_thred_demo{
    public static void main(String[] args) {
        th t1=new th();
        System.out.println("ID :"+t1.getId());
        System.out.println("Name :"+t1.getName());
        System.out.println("Priority :"+t1.getPriority());
        t1.setName("welcome");
        System.out.println("Name (after changing) :"+t1.getName());
        t1.start();
        
    }
}