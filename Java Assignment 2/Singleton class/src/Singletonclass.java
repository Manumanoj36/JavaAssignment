class Singletonclass
{
    
    private static Singletonclass single_instance = null;
  
    
    public String s;
  
   
    private Singletonclass()
    {
        s = "Hello I am a string part of Singletonclass";
    }
  
    
    public static Singletonclass getInstance()
    {
        if (single_instance == null)
            single_instance = new Singletonclass();
  
        return single_instance;
    }
}
  

class Main
{
    public static void main(String args[])
    {
       
        Singletonclass x = Singletonclass.getInstance();
  
        
        Singletonclass y = Singletonclass.getInstance();
  
        
        Singletonclass z = Singletonclass.getInstance();
  
        
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
