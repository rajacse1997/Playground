import java.util.Scanner;
class Main{
   public static int sum(int x)
    {int a=0;
       for(int i=1;i<=x;i++)
       {
         a=a+i;
       }
      return a;
    }
	public static void main (String[] args){
	     Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int sos = sum(n);
      System.out.println(sos);
	}
}