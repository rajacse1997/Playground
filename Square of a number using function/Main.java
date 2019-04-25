import java.util.Scanner;
class Main
{
    public static int square_of_number(int x)
    {
      int a= x*x;
      return a;
    }
  
	public static void main (String[] args)
    {
	   Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int sos = square_of_number(n);
      System.out.println(sos);
      
	} 
}