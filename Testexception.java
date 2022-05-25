public class Testexception {

public static void main(String[] args) {
	try
	{
	     try
	     {
		    int i=1/0;
	     }
	    catch(ArithmeticException e1)
	    {
		     System.out.println("first block Execute");
	    }
	    try
	    {
		    String b=null;
		    System.out.println(b.length());
	
	    }
    	catch(NullPointerException e2){
		   System.out.println("null pointer Exception handled:");	
	    }
}
     finally

	    {
		   System.out.println("Arithmetic Exception handle:");
	    }