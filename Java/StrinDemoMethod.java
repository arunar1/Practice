import java.util.Scanner;

class StrinDemoMethod{
    public static void main(String[] args) {

        //input a string making obj
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Your name :");
        String str =sc.nextLine();

        System.out.println(str.length());

        String str2 = "Hello ".concat(str).concat(" welcome");
        System.out.println(str2);

        System.out.println(str2.indexOf("w"));

        
    }
}