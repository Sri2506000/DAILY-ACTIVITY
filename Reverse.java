//Print the reverse number from the arraylist
import java.util.*;
class Reverse
{
public static void main(String args[])
{
int a[]=new int[5];
Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("Enter the elements of array:");
a[i]=s.nextInt();
}
System.out.println("Reverse array elements are:");
for(int i=4;i>=0;i--)
{
System.out.println(a[i]);
}
}
}