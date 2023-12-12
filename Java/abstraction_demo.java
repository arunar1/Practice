abstract class A{
    abstract void display();
    
}

abstract class B extends A{
    void display(){
        System.out.println("Class A welcome");
    }
    abstract void show();
   
}
class C extends B{
    void show(){
        System.out.println("Class B");
    }
    

}
public class abstraction_demo {
    public static void main(String[] args) {
        C obj1=new C();
        obj1.display();
        obj1.show();
    }
    
    
}
