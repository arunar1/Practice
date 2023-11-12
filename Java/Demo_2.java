public class Demo_2 {
    public static void main(String[] args){
        int temperature =22;
        boolean iswarm=temperature>20 && temperature<30;
        System.out.println("warm condition is" +iswarm);

        boolean hasHighIncome=false;
        boolean hasGoodcredit=true;
        boolean hasCriminalRecord=false;
        boolean isEligible= (hasHighIncome || hasGoodcredit) && !hasCriminalRecord ;

        System.out.println(isEligible);
    }
    
}
