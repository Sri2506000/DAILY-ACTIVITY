import java.util.Scanner;

class UseException extends Exception
{
	UseException(int a)
	{
		System.out.println(Math.abs(20-a)+"kg");
	}
}
public class Acceptluggage{
	
	public static void disp(int w)throws UseException
	{
		if(w>20)
			throw new UseException(w);
		else
			System.out.println("ready to fly...");
	}
	public static void main(String args[])throws UseException
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the luggage weight:");
        int w=s.nextInt();
		{
			try
			{
				disp(w);
			}
			catch(UseException e)
			{
				
			   System.out.println(e);
		    }
		    finally
		    {
			   System.out.println("happy journey.....");
	        
		    }
	    }
	
			
     }

}
