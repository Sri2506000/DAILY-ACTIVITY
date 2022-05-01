class positive{
public static void main(String args[]){
int a=1234;
int sum=0;
int rem;
while(a>0){
 rem=a%10;
 sum=sum+rem;
 a=a/10;
 }
 System.out.println("the sum of the positive number is"+sum);
 }
 }