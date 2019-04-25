import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      int size=sc.nextInt();
      int aa[] = new int[size];
      for(int k=0;k<size;k++)
      {
        aa[k]=sc.nextInt();
      }
      int max=aa[0];
      for(int i=0;i<size;i++)
      {
        if(aa[i]>max)
          max=aa[i];
      }
      System.out.println(max);
    }
}