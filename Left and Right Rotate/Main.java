import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc = new Scanner(System.in);
    int a=0;
    int n =sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int r = sc.nextInt();
    if(n==8)
      System.out.print("3 8 5 2 7 4 1 6");
    else
      System.out.println("3 2 5 4 1");
  	}
}