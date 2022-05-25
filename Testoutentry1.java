
public class Testoutertry1 {

		public static void main(String[] args)
		{
			try
			{
				
	int array[]= {20,30,40};
					System.out.println(array[3]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Invalid index:");
					
				}
			
		       finally
			
			{
				System.out.println("final block gets excute...");
				
				
			}
		}

	}


