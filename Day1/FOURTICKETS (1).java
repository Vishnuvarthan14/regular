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
		int x,n,i;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		   	x=sc.nextInt();
		   	if((4*x)>1000)
		   	  System.out.println("no");
		   	else
		   	  System.out.println("yes");
		}
	}
}
