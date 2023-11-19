
class A{
    void display(){
        System.out.println("Displying the : Parent ");
    }
}
class B extends A{
    void display1(){
        System.out.println("Displaying Child 1");
    }

}
class C extends B{
    void display2(){
        System.out.println("Displaying child 2");
    }

}




public class multilevel {
    public static void main(String[] args) {
        B obj1=new B();
        obj1.display();
        obj1.display1();
        C obj2 =new C();
        
        
    }
    
}
