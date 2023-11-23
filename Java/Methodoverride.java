class A{
    void display(){
        System.out.println("Parent");
    }
}

class B extends A{
    void display(){
        System.out.println("Child");
    }
}


public class Methodoverride {
    public static void main(String[] args) {

        B obj1= new B();
        obj1.display();
        
    }
    
}
