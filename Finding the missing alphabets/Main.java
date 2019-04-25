import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        String st= sc.nextLine();
      int count=0,i=0;
      String str1=st.toLowerCase();
      for(char c='a';c<='z';c++)
      { count=0;
        for(i=0;i<str1.length();i++)
        {
        if(c==str1.charAt(i))
         count++;
        }
       if(count==0)
         System.out.print(c+" ");
      }
    }
}