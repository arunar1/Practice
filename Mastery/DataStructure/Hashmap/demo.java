import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap users =new HashMap<>();

        users.put("Kealy",34);
        users.put("1", "manu");

        

        System.out.println(users.get("Kealy"));

        System.out.println("values :"+ users.values());
         
    }
    
}
