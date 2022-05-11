class rectangleshape

{

int l,b,a;

rectangleshape()

{

l=12;

b=23;

}

void getdata()

{

a=l*b;

System.out.println("area of rectangle is:"+a);

}

}

class rectangledefaultconstructor

{

public static void main(String args[])

{

rectangleshape rect=new rectangleshape();

rect.getdata();

}

}