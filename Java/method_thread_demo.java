class th  extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
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
        t1.start();
        
    }
}