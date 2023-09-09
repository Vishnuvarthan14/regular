/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
	        int a=sc.nextInt();
	         int b=sc.nextInt();
	          int c=sc.nextInt();
	           int d=sc.nextInt();
	           int max=((a>b)&&(a>c)&&(a>d))?a:((b>a)&&(b>c)&&(b>d))?b:((c>a)&&(c>b)&&(c>d))?c:d;
	           if((a+b+c<max)||(b+c+d)<max||(c+d+a)<max||(a+b+d)<max)
	           System.out.println("yes");
	           else
	           System.out.println("no");
	           
	   }
	}
}
