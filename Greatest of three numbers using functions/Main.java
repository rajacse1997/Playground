import java.util.Scanner;
class Main{
  public static int gr (int x,int y){
	    int a=0;
    if(x>y)
      a=x;
    else
      a=y;
    
    return a;
    
	}
   
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
         int n1= sc.nextInt();
       int n2= sc.nextInt();
       int n3= sc.nextInt();
      int big = gr(n1,n2);
      if(big>n3)
        System.out.println(big);
      else
        System.out.println(n3);
	}
}