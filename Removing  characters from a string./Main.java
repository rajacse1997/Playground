import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner  sc = new Scanner(System.in);
    String str= sc.nextLine();
    String str2= sc.nextLine();
      int count=0; 
    StringBuilder sb= new StringBuilder(str);
    StringBuilder sb1= new StringBuilder();
    for(int i=0;i<str2.length();i++)
    {
       for(int j=0;j<str.length();j++)
       {
          if(str2.charAt(i)==str.charAt(j))
          { sb.setCharAt(j,'.');
           count++;}
       }
    }
   // System.out.println(sb);
    for(int i=0;i<str.length();i++)
    { char v= sb.charAt(i);
     if(sb.charAt(i)!='.')
      {
        sb1.append(v);
        
      }
    }
    System.out.print(sb1);
  }
}