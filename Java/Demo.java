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
        

        int[] num={1,2,3,4,11,8,};
        System.out.println(Arrays.toString(num));

        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        //multi dimensional arrays


        int[][] numbers2=new int[5][5];
        numbers2[0][0]=4;

        System.out.println(Arrays.deepToString(numbers2));
        
        int[][] num1= {{1,2,3},{1,2}};
        System.out.println(Arrays.deepToString(num1));


        //Arithmaeic operation

        double result=10/3;
        System.out.println(result);


        //for the division

        double result1=(double)10/(double)3;
        System.out.println(result1);


        //math functions

        double result3=Math.ceil(1.1f);
        System.out.println(result3);
    }


}