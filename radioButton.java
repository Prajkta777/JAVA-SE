
package awtprojects;

import java.awt.*;
import java.awt.event.*;

class myframe3 extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public myframe3()
    {
        super("radio button");
        l=new Label("select something.....");
        cbg=new CheckboxGroup();
        c1=new Checkbox("JAVA",false,cbg);
        c2=new Checkbox("python",false,cbg);
        c3=new Checkbox("cloud",false,cbg);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
        
        
    }
    public void itemStateChanged(ItemEvent e)
    {
     String str="";
     if(c1.getState())
     {
         str=str+" "+c1.getLabel();
     }
     if(c2.getState())
     {
         str=str+" "+c2.getLabel();
     }
     if(c3.getState())
     {
         str=str+" "+c3.getLabel();
     }
     if(str.isEmpty())
     {
         str="empty...";
     }
     l.setText(str);
    }
}

public class radioButton 
{
 public static void main(String args[])
 {
     myframe3 m=new myframe3();
     m.setSize(400,400);
     m.setVisible(true);
 }
}