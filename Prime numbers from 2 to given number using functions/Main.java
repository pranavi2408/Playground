import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int i,j,x;
      for(i=2;i<=n;i++)
      {
        x=0;
       for(j=1;j<=i;j++)
       {
       if(i%j==0)
       {
         x++;
       }
       }
        if(x==2)
        {
          System.out.println(""+i);
        }
      }
	}
}