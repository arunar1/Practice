import java.util.Scanner;

public class Calc {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the operation :");
        System.out.println("+: Addition");
        System.out.println("-: Subtraction");
        System.out.println("/: Dicision");
        System.out.println("*: Multiplication");

        int num1,num2;
        
        String ch=scanner.next();
        switch (ch) {
            case "+":
            System.out.print("Additon: Enter two values :");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            System.out.println(num1+num2);
            break;
            case "-":
            System.out.print("Subtraction: Enter two values :");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            System.out.println(num1-num2);
            break;
            case "*":
            System.out.print("Multiplication: Enter two values :");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            System.out.println(num1*num2);
            break;
            case "/":
            System.out.print("Division: Enter two values :");
            num1=scanner.nextInt();
            num2=scanner.nextInt();
            System.out.println(num1/num2);
            break;
        
            default:
                break;
        }


    }
    
}
