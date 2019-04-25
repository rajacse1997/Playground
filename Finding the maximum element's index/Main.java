import java.util.Scanner;
class Main
{
  public static void max(int n,int l[])
  {
    int max=0;
    int index=0;
    for(int i=0;i<n;i++)
    {
      if(l[i]>max)
      { max=l[i];
        index=i;
      }
    }
    System.out.print(index);
  }
  
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
    {
      l[i]=sc.nextInt();
    }
    max(n,l);
  }
}