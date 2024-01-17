import java.util.HashMap;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
        HashMap users =new HashMap<>();

        users.put("Kealy",34);
        users.put("1", "manu");

        Iterator<E> it= users.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pair=(Map.Entry)it.next();
        }

        System.out.println(users.get("Kealy"));

        System.out.println("values :"+ users.values());
         
    }
    
}
