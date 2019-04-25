import java.util.Scanner;
class Main{
    public static void main(String args[]){
      int temp1=0,temp2=0;
        Scanner sc = new Scanner(System.in);
      int size=sc.nextInt();
      int aa[] = new int[size];
      for(int k=0;k<size;k++)
      {
        aa[k]=sc.nextInt();
      }
      int a= sc.nextInt();
       int b= sc.nextInt();
       
      for(int i=0;i<5;i++)
      {
        if(a==aa[i])
          temp1=i;
      }
       if(temp1>=0)
        System.out.println(temp1);
      else
      System.out.println("-1");
       for(int j=0;j<5;j++)
      {
        if(b==aa[j])
          temp2=j;
      }
      
      if(temp2>0)
        System.out.println(temp2);
      else
      System.out.println("-1");
    }
}