interface
{
void disp();
}
class Child implements
{
public void disp()
{
System.out.println("Interface method...");
}
public static void main(String args[])
{
Child c=new Child();
c.disp();
}
}