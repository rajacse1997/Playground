
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
       Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
        int b= sc.nextInt();
      for(int i=1;i<=n;i++)
      { int c=n;
        for(int j=1;j<=n;j++) 
        {
          if(j<i)
          {
           
            System.out.print(c--);}
            else
              System.out.print(((n+1)-i));
              
          
        }
        System.out.print("\n");
        
      }
    }
}