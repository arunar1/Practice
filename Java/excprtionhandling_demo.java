class Ex{
    void display(){
        try {
            // int a=5/0;

            String str=null;
            System.out.println(str.length());
            int a[]=new int[5];
            a[5]=5;
            
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Exception handled");
    }
}

public class excprtionhandling_demo {
    public static void main(String[] args) {
        Ex obj1=new Ex();
        obj1.display();
        
    }
    
}
