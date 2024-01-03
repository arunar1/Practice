//classes are blueprints


class Animal{
    void display(String name,int age){
        if(age>18){
        System.out.println("Hello "+ name +" you can add your vote" );
        }
        else{
            System.out.println("Sorry you can't vote ");
        }
    }
}

public class W_class {
    public static void main(String[] args) {
        Animal c= new Animal();

        c.display("manu", 35);

        c.display("Rahul", 16);

        Demo_private demo_1=new Demo_private(23);
        Demo_private demo_2=new Demo_private("red");
        demo_2.name="manu";
        demo_1.name="ammu";
        demo_2.age=32;
        demo_1.welcome();
        demo_2.welcome();

        
        
    }
    
}
