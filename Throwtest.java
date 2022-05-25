import java.util.Scanner;
public class Throwtest {
      public static void main(String[] args) {
    	  Scanner s=new Scanner(System.in);
    			  System.out.println("entry the amount");
    			  int amount=s.nextInt();
    			  if(amount<500)
    			  {
    				  System.out.println("not withdraw amount");
    			  }
    	
    			  else
    			  {
    				  System.out.println(" withdraw amount");  
    			  }
      }
}
