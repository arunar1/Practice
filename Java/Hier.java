
class A{
    void display(){
        System.out.println("Hello welcome to Parent");
    }
}

class B extends A{
    void display1(){
        System.out.println("child 1");
    }
}
class C extends A{
    void display2(){
        System.out.println("child2");
    }
}

public class Hier {
    public static void main(String[] args) {

        B obj1= new B();
        C obj2=new C();

        obj1.display1();
        obj2.display2();
        
    }
    
}
