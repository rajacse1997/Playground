import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int a=0;
    for(int i=1;i<=n;i++)
    {  a=n+1;
      a=a-i;
       for(int j=(n+1)-i;j>=1;j--)
       {
         System.out.print(a);
         a--;
       }
     System.out.print("\n");
    }
	}
}