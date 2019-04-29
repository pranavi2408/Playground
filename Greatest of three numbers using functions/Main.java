import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int min;
      if(n1>n2)
        min=n1;
      else
        min=n2;
      if(min>n3)
        min=min;
      else
        min = n3;
      System.out.println(""+min);
	}
}