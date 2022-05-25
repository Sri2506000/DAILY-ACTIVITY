
public class Testmultiple {
	

		public static void main(String[] args) {
			     try
			     
		{
			     
			     
				    int a[]=new int[90];
				    a[100]=5;
			     }
			    catch(ArithmeticException b)
			    {
				     System.out.println("Arithmetic exception handled:");
			    }
			    catch(ArrayIndexOutOfBoundsException x)
			    {
			    	 System.out.println("Array exception occur:");	
			    }
			    catch(NullPointerException s)
			    {
			    	 System.out.println("Null pointer Exception handled:");	
			    }
			    catch(NumberFormatException c)
			    {
			    	 System.out.println("remaining code excuted:");	
			    }	
		}
}
