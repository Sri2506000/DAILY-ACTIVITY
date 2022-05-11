import java.util.Arrays;
class Removeelement
{
public static void main(String args[])
{
int a[]={10,5,12,43,2};
System.out.println("Before removing the list of elements:"+Arrays.toString(a));
int index=1;
for(int i=index;i<a.length-1;i++)
a[i]=a[i+1];
System.out.println("Before removing the list of elements:"+Arrays.toString(a));
}
}