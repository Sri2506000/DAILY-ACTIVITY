import java.util.*;
class Acceptarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of rows:");
int row=s.nextInt();
System.out.println("Enter the size of column:");
int column=s.nextInt();
int array[][]=new int [row][column];
System.out.println("Enter the elements of array:");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
array[i][j]=s.nextInt();
}
}
System.out.println("The elements of array are:");
for(int i=0;i<row;i++)
{
for(int j=0;j<column;j++)
{
System.out.println(array[i][j]);
 }
}
}
}