import java.util.Scanner;
class Main{
  
     public static void prime(int x)
     { int count=0;
       for(int i=2;i<=x;i++)
       { count=0;
         for(int j=2;j<=i;j++)
         {
           if(i%j==0)
             count++;
         }
      if(count==1)
          System.out.println(i);
       }
     }
  
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      prime(n);
      
	}
}