import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int i=1,x=0,y=1,j=0,b=n,sum=0,z=n;
   for(i=1;i<=3;i++)
   {
     y=n%10;
     x=y*y*y;
     sum=sum+x;
     n=n/10;
   }
      if(sum==z)
        System.out.println("Armstrong Number");
        else 
          System.out.println("Not a Armstrong Number");
}}