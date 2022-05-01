class Employee1
{
int empid;
String ename,department;
int sal;
Employee1(int empid,String ename,int sal)
{
this.empid=empid;
this.ename=ename;
this.sal=sal;
}
Employee1(int empid,String ename,int sal,String department)
{
this(empid,ename,sal);//this()must be first statement only
this.department=department;
}
void disp()
{
System.out.println(empid+" "+ename+" "+sal+" "+department);
}
}
class Testthis1
{
public static void main(String args[])
{
Employee1 e=new Employee1(1,"sam",30000);
Employee1 e1=new Employee1(02,"Sri",50000,"IT");
e.disp();
e1.disp();
}
}