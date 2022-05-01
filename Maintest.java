//Initialize with reference var 
class Testclass
{
int rollno;
String name;//datemembers or instance var.
}
class Maintest
{
public static void main(String args[])
{
Testclass t=new Testclass();
Testclass t1=new Testclass();
t.rollno=1;//initialize the object with value
t.name="Pooja";
t1.rollno=2;
t1.name="priya";
System.out.println(t.rollno+" "+t.name);
System.out.println(t1.rollno+" "+t1.name);
}
}