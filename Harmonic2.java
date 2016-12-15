import java.util.Scanner;
public class Harmonic2
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a nth harmonic number");
int n=sc.nextInt();
double n1=0.0;
double n2=0.0;
double result=0.0;
for(int i=2;i<=n;i++)
{
n1=1.0f/i;
n2=n2+n1;
//result=n1+n2;
}
System.out.println(" "+n2);
}
}


