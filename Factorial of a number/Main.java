import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int i=1,y=1;
      for(i=n;i>0;i--)
      {
        y=y*i;
      }System.out.println(""+y);
	}
}