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
	int i,n,m,num;
	num=sc.nextInt();
	for(i=0;i<num;i++)
	{
	    n=sc.nextInt();
	    m=sc.nextInt();
	   
	    if((15*n)>=(2*m))
	       System.out.println("yes");
	     else
	        System.out.println("no");
	}
	}
}
