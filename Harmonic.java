import java.util.Scanner;
public class Harmonic 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nth harmonic number");
		int n=sc.nextInt();
		float h=0;
		
		
		
		for(int i=1;i<=n;i++)
		{
			h=h+(1.0f/i);
			
		}	
			System.out.println("harmonic number is:"+h);
		
	}
}

