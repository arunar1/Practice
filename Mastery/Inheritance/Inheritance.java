class A{
    void display(){
        System.out.println("Hello welcome");
    }

}
class B extends A{
    void show(){
        System.out.println("showing message");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        B demo =new B();
        demo.display();
        
    }

    
}
