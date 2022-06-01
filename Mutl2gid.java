class Mutl2 extends Thread
{
public void run()
{
System.out.println("Thread invoke..."+Thread.currentThread.getpriority());

}
public static void main(String args[])
{
Mutl2 m=new Mutl2();
Mutl2 m1=new Mutl2();
m.start();
m1.start();
m.setName("process1");
m1.setName("process2");
System.out.println("The name of thread is:"+m.getName());
System.out.println("The name of thread is:"+m.getId());
System.out.println("The name of thread is:"+m1.getName());
System.out.println("The name of thread is:"+m1.getId());

}
}