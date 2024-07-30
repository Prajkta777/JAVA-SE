
package awtprojects;

import java.awt.*;

public class AWT3rdMethod extends Frame
{
       Button b;  //refrences created
        Label l;
        TextField t;
        
    public AWT3rdMethod()
 {
      //constcter
       
        super("3rd WAY TO BUILT APP");  //super call Frame firstly then myframe class
        setLayout(new FlowLayout());
        b=new Button("OK");
        l=new Label("Name ");
        t=new TextField(20);   //20 is not size but it is visibility of words upto 20 charcters
        add(l);
        add(t);
        add(b);
 }
    public static void main(String args[])
    {
        AWT3rdMethod n=new AWT3rdMethod();
        n.setSize(200,200);
        n.setVisible(true);
    }
    
}
