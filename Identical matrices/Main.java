import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r= sc.nextInt();
    int c= sc.nextInt();
    int a[][]=new int[r][c];
     int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    
     for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        int x= sc.nextInt();
        if(x!=a[i][j])
        {
          System.out.print("No");
          i=4;
        }
         if(i==1 && j==1)
         System.out.print("Yes");
      }
      
    }
  }
}