
package bufferstreams.bufferreader;
import java.io.*;
public class ex3 {
    public static void main(String args[]) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/buffferStream&BufferReader.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
         System.out.print((char)bis.read());
         bis.mark(10);
          System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           bis.reset();
           System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           System.out.print((char)bis.read());
           //reaming letters will dispaly by following method
           
           //System.out.print("String : "+bis.readLine());   error in InputStream but not in Reader
                
                
        
    }
    
}
