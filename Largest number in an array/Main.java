import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int a[]= new int[n];
      int i,max=0,y=0,j;

      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      a[0]=max;
      for(i=0;i<n;i++)
      {
        if(a[i]>max)
        {
          max= a[i];
        }
      }
      System.out.print(""+max);
    }
}