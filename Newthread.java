
public class Newthread implements Runnable
{
 public void run()
 {
	 System.out.println("Thread phases...");
 }
 public static void main(String args[])
 {
   Newthread n=new Newthread();
   Thread t=new Thread(n);
   t.start();
 }
}
