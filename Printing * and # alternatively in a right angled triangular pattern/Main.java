import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int r,c,sum=0;
      for(r=1;r<=n;r++)
      {
        for(c=1;c<=r;c++)
        {
        if(sum%2!=0)
         System.out.print("#");  
        else
          System.out.print("*");
        sum++;
      }
       System.out.print("\n");
	}
}
}