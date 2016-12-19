import java.util.Scanner;
public class ThreeInteger
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int num=sc.nextInt();
int count=0;

int arr[]=new int[num];
int sum=0;
int Sum=0;
int i=0;
int j=0;
int k=0;
//int i,j,k;
for(i=0;i<num;i++)
{
System.out.println("please enter element at position"+(i+1));
arr[i]=sc.nextInt();
}
for( i=0;i<num-2;i++)
  { 
    for( j=i+1;j<num-1;j++)
      {
        for( k=j+1;k<num;k++)
            {
             if(arr[i]+arr[j]+arr[k]==0)
               System.out.println("Triples are:"+arr[i]+" "+arr[j]+" "+arr[k]);
                count++;
            }
      }
   }
if(count !=0)
{
 System.out.println("total number of tripples in geven list :"+count);
}
else
System.out.println("there is no tripple present");
}
}

