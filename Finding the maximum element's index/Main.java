import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in = new Scanner (System.in);
   int n = in.nextInt();
    int i;
    int a[] = new int [n];
    for(i=0;i<n;i++)
    {
    a[i]= in.nextInt();
      }
    max(a,n);
  }
  public static int max ( int a[], int n)
  {
    int max = a[0];
  int s = 0;
    for(int i=0;i<n;i++)
    {
    if (a[i]>max)
    {
      max = a[i];
      s=i;
    }
    }
  System.out.print(""+s);
    return s;
  }
}