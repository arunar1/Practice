//mortgage payemnt

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        final int number_of_month=12;
        final int percent=100;



        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Enter the principal amount :");
        double Principal_amount=scanner.nextDouble();
        
        System.out.print("Enter the Interest :");
        float Interest=scanner.nextFloat();
        
        System.out.print("Enter the no.of Year :");
        int year=scanner.nextInt();

        float monthly_interest=Interest/percent/number_of_month;
        int no_of_month=year*number_of_month;
        
        double mortage_payemnt=Principal_amount*Math.pow((1+monthly_interest),no_of_month)/(Math.pow((1+monthly_interest),no_of_month)-1);

        System.out.println("The mortage payment :" + mortage_payemnt);

        


    }
    
}
