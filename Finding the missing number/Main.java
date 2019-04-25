import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int a[]=new int[n];
      int ax=1,st=0;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int j=1;j<=n;j++)
      {ax=1;
        for(int i=0;i<n;i++)
        {
          if(j==a[i])
          {
            ax=0;
            break;
          }
        }
         if(ax==1)
         {st=j;j=n+1;}
      }
      if(ax==1)
        System.out.print(st);
        
    }
}