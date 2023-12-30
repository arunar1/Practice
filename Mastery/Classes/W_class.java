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
        
    }
    
}
