import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int a[]= new int[n];
      int i,x=0,y=0,j;

      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int s1=in.nextInt();
      int s2 =in.nextInt();
    
      for(i=0;i<n;i++){
      if(a[i]==s1)
      {
       x++;
        break;
      }
      }
       for(j=0;j<n;j++){
      if(a[j]==s2)
      {
       y++;
        break;
      }
    }
      if(x>0)
         System.out.println(""+i);
      else
         System.out.print("-1");
      if(y>0)
         System.out.println(""+j);
      else
         System.out.print("-1");
    }
}
 