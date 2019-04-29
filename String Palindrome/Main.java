import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner (System.in);
      String a = scan.nextLine();
      int n = a.length();
      int i =0,j=0;
      String b="";
      for(i=n-1;i>=0;i--)
      {
      b=b+a.charAt(i);
      }
      if(a.equals(b))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}