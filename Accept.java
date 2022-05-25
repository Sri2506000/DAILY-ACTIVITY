public class Accept {
	public static void main(int age) {
		if (age<18)
			try
		{
				throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("not eligible to vote..");
		}
		else
		{
			System.out.println("eligible to vote..");
			
		}
	}
		public static void main(String args[])
		{
			accept(19);
			
		}
}
