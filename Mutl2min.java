class Mutl2 extends Thread
{
public void run()
{

System.out.println("Thread invoke.."+Thread.currentThread.getpriority());
}

public static void main(String args[])
{
Mutl2 m=new Mutl2();
m.setpriority(9);
m.start();

}
}