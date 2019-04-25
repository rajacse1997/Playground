import java.util.Scanner;
class Main{
    public static void main(String args[])
    { 
      
        Scanner sc= new Scanner(System.in);
        String st= sc.nextLine();
      char s='a';
      int cc=0,ca=0;
        String str1=st.toLowerCase();
      StringBuilder str= new StringBuilder(str1);
      for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)!=' ')
        {
        s=str.charAt(i);
        cc=0;
        for(int j=i;j<str.length();j++)
        {
          if(s==str.charAt(j))
          {
            cc++;
          }
        }System.out.print(s+""+cc+" ");
        for(int k=0;k<str.length();k++)
        {
          if(s==str.charAt(k))
            str.setCharAt(k,' ');
        }
      }
      }
    }
}