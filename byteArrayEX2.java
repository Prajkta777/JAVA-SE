
package filetask2;
import java.io.*;
public class byteArrayEX2 {
    public static void main(String args[])throws Exception
    {
        //reading all bytes at at single time
            byte b[]={'a','b','c','d','v'};
       ByteArrayInputStream bis=new ByteArrayInputStream(b);
       String str=new String(bis.readAllBytes());
       System.out.print(str);
       bis.close();
    }
    
}
