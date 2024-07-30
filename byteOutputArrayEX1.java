
package filetask2;
import java.io.*;
public class byteOutputArrayEX1 {
    public static void main(String args[]) throws Exception
    {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(15);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        //converting bytes into byte array[]
        byte b[]=bos.toByteArray();
        
        //reading byte array
        for(byte x:b)
           // System.out.print(x);  //ascii values return
            System.out.print((char)x);  //charcters returns thst's why type casting requird
      System.out.print(" ");
        for(byte x:b)
           System.out.print(x);
        bos.close();
    }
    
}
