class bus
{
void disp()
{
System.out.println("parent class excuted");
}
}
class colour extends bus
{
void disp1()
{
System.out.println("child class excuted");
}
}
class Testsingle
{
public static void main(String args[])
{
colour c=new colour();
c.disp();
c.disp1();
}
}