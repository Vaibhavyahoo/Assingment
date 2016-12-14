import java.util.Scanner;
public class LeapYear
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 4 digit number");
try
{
int number=sc.nextInt();
}
catch(Exception e)
{
System.out.println(e);
}

               
if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
//if((number % 4 == 0 ) && (number % 100!= 0))
{
System.out.println("year is leap");
}
else
System.out.println("year is not leap");

}
}
