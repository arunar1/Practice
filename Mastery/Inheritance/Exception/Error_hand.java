
// import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Exception;

public class Error_hand {
    public static void main(String[] args) {
        // array two way initialization

        int[] number = { 5, 6, 4, 4, 8, 7, 8, };
        int demo[] = { 2, 3, 4, 0, 8 };
        System.out.println(number[0]);
        System.out.println(Arrays.toString(number));
        // System.out.println(Arrays.asList(number));
        for (int i = 0; i < number.length; ) {

            try {
                System.out.println(number[i] / demo[i]);

            } catch (ArithmeticException e) {

                System.out.println("Division by zero not allowed");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of bound");

            }
            finally{
                // will always run
                System.out.println("Running");
                i++;
            }
        }
    }

}
