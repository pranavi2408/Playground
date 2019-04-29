import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
          Scanner in = new Scanner(System.in);
       int n= in.nextInt();
      int r,c;
      for(r=1;r<=n;r++){
      for(c=1;c<=r;c++){
        System.out.print(""+r);
      }
       System.out.println("");}
	}
}