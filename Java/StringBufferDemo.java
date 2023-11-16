public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Welcome");
        System.out.println(str);

        System.out.println(str.delete(1, 2));

        System.out.println(str.substring(4));
        System.out.println(str.subSequence(2, 5));

    }
}
