public class Finalcheck {
}
class Method extends Finalcheck
{
	final void disp()
	{
		System.out.println("child class gets excuted:");
	}
	public static void main(String[] args)
	{
		Method v=new Method();
		v.disp();
	}
}