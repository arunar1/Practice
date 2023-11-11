import java.util.Scanner;

public class Demo_1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name :");
        String name= scanner.nextLine();
        
        
        System.out.print("Enter Your age :");
        byte age=scanner.nextByte();
        

        System.out.println("Hi "+name.trim()  +"  welcome your age is " +age);

    }
    
}
