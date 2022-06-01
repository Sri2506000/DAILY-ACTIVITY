class Mutl2 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
try
{
Thread.sleep(1000);
}catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
Mutl2 m=new Mutl2();
Mutl2 m1=new Mutl2();
m.start();
m1.start();
}
}