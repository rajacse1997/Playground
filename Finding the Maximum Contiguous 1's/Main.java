import java.util.Scanner;
public class Main
{  
    public static int max(int ar[],int n)
    {
     int count=0,c=0; 
      for(int i=0;i<n;i++)
      {
        if(ar[i]==1)
          count++;
        else
        {  if(count>c)
           c=count;
          count=0;
        }
      }
      return c;
     
    }
    public static void main(String args[])
    {
    	
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
       arr[i]=sc.nextInt(); 
      }
     int x= max(arr,n);
      System.out.print(x);
    }
}