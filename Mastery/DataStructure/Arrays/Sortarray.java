import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortarray {
    public static void main(String[] args) {
        int[] arrInt={7,2,3,4,5};

        String[] arrStrings={"arun","manu","anamika"};

        boolean[] arrBools={true,false,true};

        Arrays.sort(arrInt);
        Arrays.sort(arrStrings);

        System.out.println(Arrays.toString(arrInt));

        System.out.println(Arrays.toString(arrStrings));

         
    }
    
}
