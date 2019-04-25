import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int a=0,b=0,sum=0,nn=n;
      while(n != 0)
      {
        a=n%10;
        b=1;
           for(int j= 1;j<=a;j++)
           {
             b=b*j;
           }
        sum=sum+b;
        
        n=n/10;
      }
      
      if(nn==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}