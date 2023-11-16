public class StaticBlock {
    static int a=10;
    static void display(){
        System.out.println("Hello welcome");

    }
    static{
        System.out.println("Static block welcome");
    }
    public static void main(String[] args) {
        System.out.println(a);
    }
    
}
