import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int i=1,y=1,x=1,sum=0,b;
      b=n;
     while(n!=0)
     {
       y=n%10;
       x=1;
       for(i=1;i<=y;i++)
       {
         x=x*i;
       }
       sum=sum+x;
       n=n/10;
     }
      if(sum==b)
        System.out.println("Yes");
      else
         System.out.println("No");

	}
}