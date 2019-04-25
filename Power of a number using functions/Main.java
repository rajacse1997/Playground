import java.util.Scanner;
class Main {
      public static int power(int a,int b)
{ int s=1;
   for(int i=1;i<=b;i++)
   {
     s=s*a;
   }
 return s;
}
  
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int b= sc.nextInt();
       int p= sc.nextInt();
      int pow= power(b,p);
      System.out.println(pow);
	}
}