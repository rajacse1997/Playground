import java.util.Scanner;
class Main {
	public static void main (String[] args){
	       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a=0;
      int count=0;
         for(a= 1;count<n;a++)
         {
           if(a%2==1)
           { count++;
             System.out.println(a);
           }
         }
	}
}