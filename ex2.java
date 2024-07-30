package bufferstreams.bufferreader;
import java.io.*;
public class ex2 {
    public static void main(String args[])throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/buffferStream&BufferReader.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int b;
        while((b=bis.read())!=-1)
            System.out.print((char)b);
        
        
    }
    
}
