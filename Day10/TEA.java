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
	   int mod=a/b;
	   if(a%b!=0)
	   mod++;
	   int res=mod*c;
	   System.out.println(res);
	}
	}
}
