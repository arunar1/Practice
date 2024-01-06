import java.util.*;
import java.lang.Exception;

public class Args {
    public static void main(String[] args) {
        float sum=0;
        for(String arg:args){
            try {
                sum=sum+Float.parseFloat(arg);
            } catch (Exception e) {
                System.out.println(arg+" is not a  Number :"+e.getMessage());
                
            }
            
            
        }
        System.out.println("Total sum :"+ sum);
     }
}
