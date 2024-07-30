
package enumdemo;

enum Dept{
    CS,IT,CES,ECE,ME
}

 enum info
        {
        a("first",1), b("second",2) ,c("third",3);
        String name;
        int num;
       
private info(String name,int n)
{
this.name=name;
this.num=n;
}
public String getname(){return name;}
public int getnum(){return num;}
 }//info closed
public class Enumdemo {
    
    public static void main(String[] args) {
        Dept d=Dept.CS;
        Dept d1=Dept.ME;
        System.out.println("ordinal : "+ d.ordinal());
        System.out.println("name: "+ d.name());
        System.out.println(d1.ordinal());
        System.out.println(d1.name());
        System.out.println(Dept.valueOf("IT")); //checks matching or not
        // System.out.println(Dept.valueOf("it")); //exception
        
        Dept list[]=Dept.values();
        for(Dept x:list)
        {
            System.out.println("index "+x.ordinal()+" name: "+x);
        }

        //switch case
        Dept d2=Dept.CES;
        switch(d2)
                {
                    case CES: System.out.println("Computer science");
                                break;
                    case IT: System.out.println("it");
                                       break;
                    case CS: System.out.println("cs");
                                break;
                    case ECE: System.out.println("ece");
                                break;
                    case ME: System.out.println("me");
                                break;
                    default: System.out.println("Please enter valid data!!");
                            break;
                }
                
        //enum's methods / constructors can private or default
       //enum info
       info i=info.a;
       System.out.println("info -- "+ i.getname());
      System.out.println("info -- "+ i.getnum());


    }
    
}
