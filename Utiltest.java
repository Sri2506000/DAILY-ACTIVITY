import java.util.*;
	
public class Utiltest {

    public static void main(String[] args) 
    {
	System.out.println("Enter number:");
	Scanner s=new Scanner(System.in);
			int a=s.nextInt();
	System.out.println(" number is:"+a);
	int b[]= {10,6,8};
	Arrays.sort(b);
	System.out.println("Elements are:"+Arrays.toString(b));
	s.close();
}
}