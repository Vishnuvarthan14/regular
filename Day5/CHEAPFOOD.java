/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	    int x=sc.nextInt();
	    int per=(x/100)*10;
	   
	   
	    if(per==100)
	       System.out.println(per);
	    else if (per>100) 
	        System.out.println(per);
	    else
	         System.out.println("100");
	    
	}
	}
}
