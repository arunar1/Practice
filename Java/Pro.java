


class A{
    int a=20;
    void display(){
        System.out.println("Parent");
        System.out.println(a);
    }

}
class B extends A{
    int a=40;
    void display(){
        System.out.println("Child");
        System.out.println(a);
        System.out.println(super.a);
        super.display();
       
    }
}



public class Pro {
    public static void main(String[] args) {
        System.out.println("welcome to Programing");
        B obj1 =new B();
        obj1.display();


    }
    
}
