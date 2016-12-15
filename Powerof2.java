import java.util.Scanner;
public class Powerof2
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter power which lesss than 30");
int n=sc.nextInt();
int result=1;
for(int i=1;i<=n;i++)
{
result=result*2;
}
System.out.println(n+"th power of 2 is :"+result);


}
}
