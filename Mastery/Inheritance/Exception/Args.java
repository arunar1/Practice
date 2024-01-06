
public class Args {
    public static void main(String[] args) {
        float sum=0;
        for(String arg:args){
            sum=sum+Float.parseFloat(arg);
            System.out.println(sum);
        }
        System.out.println("Total sum :"+ sum);
     }
}
