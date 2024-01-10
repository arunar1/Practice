
public class poly {
    public static void main(String[] args) {
        Tub myTub=new Tub(13);

        System.out.println(myTub.getSize());
        myTub.setSize(14);
        System.out.println( myTub.getSize()+ " " + myTub.getBubbleColor());
    }
    
}
