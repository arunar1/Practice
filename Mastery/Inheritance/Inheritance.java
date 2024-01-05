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

class C extends B{
    void talk(){
        System.out.println("Welcome to Talk");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        B demo =new B();
        demo.display();
        C demo_1 = new C();
        demo_1.talk();

        
    }

    
}
