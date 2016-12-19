import java.util.Scanner;
public class Anagram
{
public static void main(String []args)
{
String str1,str2;
int len,len1,len2,i,j;
int found=0,notfound=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter first string");
str1=sc.nextLine();
System.out.println("enter second string");
str2=sc.nextLine();
len1=str1.length();
len2=str2.length();
if(len1==len2)
{
len=len1;
for(i=0;i<len;i++)
{
found=0;
for(j=0;j<len;j++)
 {
if(str1.charAt(i)==str2.charAt(j))
  {
    found=1;
     break;
  }
 }
}
if(found==0)
{
notfound=1;
//break;
}

if (notfound==1)
{
System.out.println("there is no anagram in a string");
}
else
{
System.out.println("Strings are anagram");
}
}
else
System.out.println("length are not equal");
}
}
