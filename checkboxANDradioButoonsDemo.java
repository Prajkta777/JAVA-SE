
package awtprojects;

import java.awt.*;
import java.awt.event.*;

class myframe2 extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    
    public myframe2()
    {
        super("radio buttons and checkbox demo");
        l=new Label("select something...");
        c1=new Checkbox("JAVA");
        c2=new Checkbox("PYTHON");
        c3=new Checkbox("AWS");
        
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
            str="empty string";
        }
        l.setText(str);
    }
}

public class checkboxANDradioButoonsDemo
{
    public static void main(String args[])
    {
        myframe2 m=new myframe2();
        m.setSize(300,300);
        m.setVisible(true);
    }
}
