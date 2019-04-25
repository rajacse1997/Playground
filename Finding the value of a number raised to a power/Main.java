import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
        int b= sc.nextInt();
      int nn=n;
     // System.out.print(n); 
     // System.out.print(b); 
      for(int i=1;i<b;i++)
       nn=nn*n;
      System.out.println(nn);  

    }
}