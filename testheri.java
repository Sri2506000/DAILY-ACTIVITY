 class parent

{

void disp()

{

System.out.println("parent class invoked..");

}

}

class child1 extends parent

{

void disp1()

{

System.out.println("child1 class invoked..");

}

}

class child2 extends parent

{

void disp2()

{

System.out.println("child2 class invoked..");

}

}

class testheri

{

public static void main(String args[])

{

child2 c=new child2();

c.disp();

c.disp2();

child1 c1=new child1();

c1.disp();

c1.disp1();

}

}