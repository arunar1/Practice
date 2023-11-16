
class A{
       
        A(){
            System.out.println("Hello welcome");

        }
        A(int b){
            System.out.println("Hello "+b);
        }
    }
    
class Overloading{
    
    public static void main(String[] args) {

        A obj1 =new A();
        A obj2 =new A(10);
       
    }

}