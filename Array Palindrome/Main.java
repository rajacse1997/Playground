import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int a[]=new int[n];
      int ax=1;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++)
      {
        if(a[j]==a[n-(j+1)])
          ax=0;
        else
        { ax=1;
         break;
        }
      }
      if(ax==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}