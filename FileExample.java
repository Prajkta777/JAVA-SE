
package fileexample;
import java.io.*;
public class FileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try
        {
            FileOutputStream fos=new FileOutputStream("C:/Users/Priyanka/Documents/NetBeansProjects/MN.txt");
            String str="java programming ";
            fos.write(str.getBytes());
            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    //ON TERMINAL AFTER netbeans project foler
    /*
    type MN.txt
    dir
    del M*.*
    dir
    */
   
    
}
