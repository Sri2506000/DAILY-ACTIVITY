class passmethodarray
{
static void disp(int a[])
{
int min=a[0];
for(int i=0;i<a.length;i++)
if(min>a[i])
min=a[i];
System.out.println(min);
}
public static void main(String args[])
{
int a[]={11,4,6,1};
disp(a);
}
}