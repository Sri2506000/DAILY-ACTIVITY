class Mutl2 extends Thread
{
public void run()
{

System.out.println("Thread invoke..");
}

public static void main(String args[])
{
Mutl2 m=new Mutl2();
System.out.println("The name of thread is:"+m.getName());

m.start();

}
}