abstract class Outerclass
{
abstract void disp();
}
class Testclass
{
public static void main(String args[])
{
Outerclass o=new Outerclass()
{
void disp()
{
System.out.println("Test anonymyous class...");
}
};
o.disp();
}
}