import java.util.Scanner;

public class Weather {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the Temperature :");
        float temp=scanner.nextFloat();

        if(temp>20 && temp<30){
            System.out.println("Moderate Warm");
        }
        else if(temp>30){
            System.out.println("Warmer");
        }
        else{
            System.out.println("Colder");
        }
    
}
}