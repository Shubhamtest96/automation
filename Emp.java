
import java.util.Scanner ; 

interface client
{
    void input ();
    void output();
}


class Emp implements client {
    String name ;
    double sal ;
    public void input () {
        
        Scanner r = new Scanner (System.in) ; 
        System.out.println("enter username");
        name = r.nextLine () ;
        
         System.out.println("enter salary");
        sal = r.nextDouble () ;
        
        
    }
   public void output () {
        System.out.println(name  +" " + sal); 
    }
    public static void main (String [] args)  {
        client c = new Emp();
        c.input();
        c.output();
        
    }
}
