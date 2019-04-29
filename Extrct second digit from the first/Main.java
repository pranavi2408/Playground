import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int digits=0,same=n,x=0,res=0;
      while(n!=0)
      { 
        n=n/10;
        digits++;
      }
      while((digits-2)>0)
      {
        same= same/10;
        digits--;
      }
      x=same%10;
      System.out.println(""+x);
    }
}