
package filetask2;
import java.io.*;
public class ByteArrayOutputReaderEx1 {
         public static void main(String args[])throws Exception
         {
             char c[]={'v','s','c','o','d','e'};
             // char reader
             CharArrayReader cr=new CharArrayReader(c);
             int x;
             while((x=cr.read())!=-1)
                 System.out.print((char)x);
           cr.close();
         }
    
}
