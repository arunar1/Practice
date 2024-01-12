import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        //arraylist

        //give lot of method

        ArrayList<String> animals =new ArrayList<>();

        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Parrot");

        if(animals.contains("Dog")){
            animals.remove("Dog");
            animals.add("chicken");
        }
        animals.remove(0);
        for(String animal:animals){
            System.out.println("Animal :"+animal);

        }

        System.out.println(animals.size());
        System.out.println(animals);
    }
    

}
