import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc= new Scanner(System.in);
      String a= sc.nextLine();
       String b= sc.nextLine();
      String str=a.concat(a);
      int t=0;
     if((str.contains(b))==true)
       System.out.print("Yes");
      else
        System.out.print("No");
    }
}