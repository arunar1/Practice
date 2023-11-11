import java.util.Arrays;

public class Demo{
    public static void main(String[] args){
        int age=45;
        System.out.println(" Hello");
        System.out.println(age);
        //datatype
        byte Age=30;
        System.out.println(Age);
        //when using long use l/L as suffix to the number

        String message=" Hello word" + " !!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.replace("!","*"));
        System.out.println(message.trim());


        // Arrays

        int[] numbers =new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        

        int[] num={1,2,3,4};
        System.out.println(Arrays.toString(num));

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));
        
    }
}