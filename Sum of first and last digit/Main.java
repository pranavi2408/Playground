import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int i=1,b=n,c=1,x=1,y=1,z;
      while(n>=10)
      {
        n=n/10;
      }
     
      y=b%10;
      z=n+y;
      System.out.println(""+z);
    }
}