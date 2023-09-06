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
	int i,n,a,b,c;
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    int a1=a*10;
	     if(a1>b)
	       {
	           System.out.println( b*c);
	       }
	   else
	   {
	       System.out.println(a1*c);
	   }
	}
	}
}
