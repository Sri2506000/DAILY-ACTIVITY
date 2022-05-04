class animals
{
void disp()
{
System.out.println("this is parent");
}
}
class dog extends animals
{
void disp1()
{
System.out.println("this is doggy");
}
}
class cat extends dog
{
void disp2()
{
System.out.println("this is kitty");
}
}
class multilevel
{
public static void main(string[]args)
{
cat s=new cat();
s.disp();
s.disp1();
s.disp2();
}
}