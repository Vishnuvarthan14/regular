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
	   
	   if((b+(c*2))>=a)
	   System.out.println("Qualify");
	   else
	   System.out.println("NotQualify");
	   //int res=mod*c;
	   //stem.out.println(res);
	}
	}
}
