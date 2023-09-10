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
		   int first=(a*100)/100;
		   int second=(b*200)/100;
		    if((100-first)>(200-second))
		    System.out.println("SECOND");
		    else if ((100-first)==(200-second))
		    System.out.println("BOTH");
		    else
		    System.out.println("first");
		}
	}
}
