interface A{
    void Adisplay();
}
interface B{
    void Bdisplay();
}

class AB implements A,B{
    public void Adisplay(){
        System.out.println("A Display");
    }
    public void Bdisplay(){
        System.out.println("B display");
    }
}


public class interface_demo_ {
    public static void main(String[] args) {
        AB obj1 =new AB();
        obj1.Adisplay();
        obj1.Bdisplay();
    }
    
}
