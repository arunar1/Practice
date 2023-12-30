
public class Demo_private {
    public String name;
    private int age;

    /*
     * for acessing the private varible declared in a class we use constructor
     */
    
    public Demo_private(int age) {
        this.age = age;
    }

    public void welcome(){
        System.out.println("Hello welcome " +name +" Your "+age);
    }

    
}
