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
	int i,n,x;
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
	    x=sc.nextInt();
	    if(x%2==0)
	    {
	        if(x%7==0)
	        {
	            System.out.println("alice");
	        }
	        else{
	            System.out.println("charlie");
	        }
	    }
	    else
	    {
	        if(x%9==0)
	        {
	            System.out.println("bob");
	        }
	        else{
	            System.out.println("charlie");
	        }
	        
	    }
	   
	}
	}
}
