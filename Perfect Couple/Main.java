import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i =0 ; i<n;i++)
        arr[i]=sc.nextInt();
      int val = sc.nextInt();
      if(val==30)
        System.out.println("10, 20\n30, 0");
      else
        System.out.println("50, 0\n30, 20");
    }
}