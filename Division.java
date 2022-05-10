class Student
{
Student()
{
System.out.println("parent class method...");
}
}
class Division extends Student
{
Division()
{
super();
System.out.println("child class method excute...");
}
public static void main(String args[])
{
Division d=new Division();
}
}