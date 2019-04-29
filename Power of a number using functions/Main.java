import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int x = in.nextInt();
      int i,sum=1;
      for(i=1;i<=x;i++)
      {
        sum=sum*n;
      }
      System.out.print(""+sum);
	}
}