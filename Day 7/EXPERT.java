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
	    float a=sc.nextInt();
	    float b=sc.nextInt();
	   
	    if((a/2)<=b)
	    System.out.println("yes");
	    else
	    System.out.println("no");
	}
	}
}
