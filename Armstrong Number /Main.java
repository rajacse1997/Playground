import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
        int nn= n;
      int sum=0,a=0;
      while(n != 0)
      {
        a=n%10;
        sum= sum+(a*a*a);
        n=n/10;
      }
      if(nn==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}