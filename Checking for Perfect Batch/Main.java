import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int l[]=new int[n];
    for(int i=0;i<n;i++)
    {
      l[i]=sc.nextInt();
    }
    
    int k= n/3;
int m[]=new int[k];
int f=0,s=0,a=0,j;

for(int x=0;x<k;x++)
{ f=0;
for(j=a;j<(a+3);j++)
{//System.out.println(j+"  "+x);
 f=f+l[j];
 m[x]=f;
}
a=a+3;

}

for(int r=0;r<k;r++)
{
  if(m[0]==m[r])
{
  s=1;
}
else
s=0;
}

if(s==1)
System.out.println("Perfect Batch");
else
System.out.println("Not a Perfect Batch");
    
  }
}