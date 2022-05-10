
import java.util.Scanner;
class Addelement
{
public static void main(String args[])
{
int a[]=new int[5];
int l=a.length;
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("Enter the elements of array:");//1 2 3 4 5
a[i]=s.nextInt();
}
int newarray[]=new int [l+1];
System.out.println("Enter the position with respect index:");
int index=s.nextInt();
for(int i=0;i<l+1;i++)
{
if(i<index-1)
{
newarray[i]=a[i];
}else if(i==index-1)
{
newarray[i]=newelement;
}
else
{
newarray[i]=a[i-1];
}
}
System.out.println("New list by adding the element");
}
}

