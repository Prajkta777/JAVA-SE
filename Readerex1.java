
package bufferstreams.bufferreader;
import java.io.*;
public class Readerex1 {
    public static void main(String args[]) throws Exception
    {
        FileReader fis=new FileReader("C:/Users/Priyanka/Documents/NetBeansProjects/buffferStream&BufferReader.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        
        System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.mark(5);
          System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           bis.reset();
           System.out.print((char)bis.read());
           //reaming text display by follwing method
           System.out.print("String: "+bis.readLine());
           
    }

    
}
