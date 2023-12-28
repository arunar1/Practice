import java.util.Scanner;

public class If_Demo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Your age :");

        int age=sc.nextInt();

        if(age>18){
            System.out.println("Welcome sir you have pass available");

        }
        else{
            System.out.println("Sorry you are younger");
        }




        
    }
    
}
