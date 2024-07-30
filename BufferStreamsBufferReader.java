
package bufferstreams.bufferreader;
import java.io.*;
public class BufferStreamsBufferReader {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:/Users/Priyanka/Documents/NetBeansProjects/buffferStream&BufferReader.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        System.out.println("File: "+fis.markSupported());
        System.out.println("Buffer: "+ bis.markSupported());
        
    }
    
}
