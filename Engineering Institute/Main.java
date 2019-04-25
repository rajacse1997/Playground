//import required packages
import java.util.Scanner;

class Faculty
{ public int bsal;
  public void salary()
  {
    //write your Faculty class statements
    Scanner sc= new Scanner(System.in);
    bsal=sc.nextInt();
    System.out.println("Base Salary: "+bsal);
  }
}
class CSE extends Faculty
{  
  public void salary()
  { super.salary();
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(3000+bsal));
  }
}
class IT extends CSE
{
  public void salary()
  {super.salary();
    System.out.println("IT Faculty: "+(5000+bsal));
  }
}
class ECE extends IT
{
  public void salary()
  {super.salary();
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(4500+bsal));
  }
}

class Main
{
  public static void main(String[] args)
  {
    
   //  CSE obj1 = new CSE();
    //obj1.salary();
   //  IT obj2 = new IT();
   // obj2.salary();
    ECE obj = new ECE();
    obj.salary();
    
    //implement your required concept here
  }
}