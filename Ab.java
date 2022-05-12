abstract class parent
{
abstract public void disp();
public void show()
{
System.out.println("Normal gets executed....");
}
}
class child extends parent
{
public void disp()
{
System.out.println(" child Normal gets executed....");
}
}
class Ab
{
public static void main(String args[])
{
child c=new child();
c.disp();
c.show();
}
}