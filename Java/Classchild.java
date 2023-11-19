

class A{
    int a =5;
    A(){
        System.out.println("Welcome to parent class");
    }

}
class B extends A{ 
    B(){
        System.out.println("Child class");
    }

}



public class Classchild {
    public static void main(String[] args) {
        
        B obj1=new B();
        System.out.println(obj1.a);

        
    }
    
}
