import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int sum= 0;
      int a=0;
        while(num != 0)
        {
          a= num%10;
          num= num/10;
          sum= sum+a;
        }
      System.out.println(sum);
	}
}