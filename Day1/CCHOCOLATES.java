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
		int x,y,n,i,z;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		   	x=sc.nextInt();
		   	y=sc.nextInt();
		    z=sc.nextInt();
		    int result=((x*5)+(y*10))/z;
		    System.out.println(result);
	}
}
}
