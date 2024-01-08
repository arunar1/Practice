// import java.lang.reflect.Array;
import java.util.Arrays;

public class Error_hand {
    public static void main(String[] args) {
        //array two way initialization

        int[] number={1,2,3,4,5,};
        int demo[]={2,3,4};
        System.out.println(number[0]);
        System.out.println(Arrays.toString(demo));
        // System.out.println(Arrays.asList(number));
        try {
            for(int i=0;i<number.length;i++){
                System.out.println(demo[i]);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    
}
