import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n= in.nextInt();
      int digits,sum=0,rem=0;
      while(n!=0)
       {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
      }
      System.out.println(""+sum);
	}
}