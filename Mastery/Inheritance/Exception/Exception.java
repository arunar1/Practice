import Exception

public class Exception {
    public static void main(String[] args) {
        String[] myarray={"hello","hi"};
        try {
            System.out.println(myarray[2]);
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
    
}
