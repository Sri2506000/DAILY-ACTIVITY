class Student
{
private int rollno;
public int getroll()
{
return rollno;
}
public void setroll(int roll)
{
this.rollno=roll;
}
}
class Testen
{
public static void main(String args[])
{
Student s=new Student();
s.setroll(1);
System.out.println("The rollno is:"+s.getroll());
}
}