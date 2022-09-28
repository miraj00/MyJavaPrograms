package OOP;

public class ParentChildMethod {
    
    public void t2() {
      int x=10;
      int y=25;
      
      int z=x+y; 
      System.out.println("Sum of x+y = " + z);
    }

    public void t3() {
      int x=1;
      int y=2;
      
      int z=x+y; 
      System.out.println("Sum of x+y = " + z);
    }
    
    public static void main(String args[]) {

        ParentChildMethod t = new ParentChildMethod();
        t.t2();
     
        t.t4();
        t.t3();
    }
    
    public void t4() {
      int x=5;
      int y=5;
      
      int z=x+y; 
      System.out.println("Sum of x+y = " + z);
    }   
    
    
}
