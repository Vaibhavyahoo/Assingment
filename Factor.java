import java.util.Scanner;
public class PrimeFactor
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
			int num=sc.nextInt();
		int m=num/2;
                int i;
		while(num>0)
		{
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println(i+" ");
                                         i++;
					//num=num/10;
				}
				//else
				//	i++;
			}
                         
                                        num=num/10;


                                       //System.out.println(i+" ");
		}
	}
}











