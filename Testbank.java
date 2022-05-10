class Bank
{
void interest()
{
System.out.println("Welcome to Bank portal...");
}
}
class Axis extends Bank
{
void interest()
{
System.out.println("Welcome Axis to Bank portal...");
}
}
class Icici extends Bank
{
void interest()
{
super.interest();
System.out.println("Welcome ICICI to Bank portal...");
}
}
class Testbank
{
public static void main(String args[])
{
Icici i=new Icici();
i.interest();
Axis a=new Axis();
a.interest();
}
}

