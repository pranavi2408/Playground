import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
        Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int min;
      if(n1>n2)
        min=n2;
      else
        min=n1;
      if(min>n3)
        min=n3;
      else
        min = min;
      while(min>=0){
      if(n1%min==0&&n2%min==0&&n3%min==0)
      {
        System.out.println(""+min);
          break;
      }
        else
          min--;
      }
	}
}