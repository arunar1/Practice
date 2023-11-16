import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args)throws IOException
    {
        // InputStreamReader ir=new InputStreamReader(System.in);
        FileReader ir = new FileReader("read.txt");
        BufferedReader br= new BufferedReader(ir);

       String a =br.readLine();
       System.out.println(a);
    }
    
}
