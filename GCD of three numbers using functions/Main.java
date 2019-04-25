import java.util.Scanner;
public class Main{
  public static int g(int x,int y)
  {int min=0,gcd=0;
    if(x>y)
      min=y;
   else 
     min=x;
      
   for(int i=1;i<=min;i++)
   {
     if(x%i==0 && y%i==0)
       gcd=i;
   }
   return gcd;
  }
    
	public static void main (String[] args)
	{
	    Scanner sc= new Scanner(System.in);
      int n1= sc.nextInt();
      int n2= sc.nextInt();
      int n3= sc.nextInt();
      int GCD1 = g(n1,n2);
      int GCD2 = g(GCD1,n3);
      System.out.println(GCD2);
	}
}