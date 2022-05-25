
public class Finalvar
{
		final int a=20;
		void disp()
		{
			a=4;
			System.out.println(a);
		}
		public static void main(String[] args)
		{
			Finalvar v=new Finalvar();
			v.disp();
		}
	}


