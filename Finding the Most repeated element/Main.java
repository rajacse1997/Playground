import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
     for(int i=0;i<n;i++)
      {
       arr[i]=sc.nextInt(); 
      }
    int e=0,c=0,count=0;
    for(int i=0;i<n;i++)
    { count=0;
      for(int j=i;j<n;j++)
      {
        if(arr[i]==arr[j])
          count++;
      } 
      if(count>c)
      {
       c=count;
        e=arr[i];
      }
    }
    System.out.print(e);
  }
}