//Calculate the Largest number from the array.
import java.util.*;
class Largest
{
public static void main(String args[])
{
int a[]=new int[5];
int max=a[0];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("enter the values of array:");
a[i]=s.nextInt();
}
for(int i=1;i<5;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("Maximum number is:"+max);
}
}
