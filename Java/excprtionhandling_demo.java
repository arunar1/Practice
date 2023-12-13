class Ex{
    void display(){
        try {
            int a=5/0;
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class excprtionhandling_demo {
    public static void main(String[] args) {
        Ex obj1=new Ex();
        obj1.display();
        
    }
    
}
