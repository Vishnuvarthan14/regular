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
		int pra[]=new int[4];
		int count=0;
		for (int i=0;i<4;i++ )
		{
		    pra[i]=sc.nextInt();
		}
	    for (int i=0;i<4;i++ )
		{
		      if (pra[i]>=10)
		      {
		          count++;
		      }
		}
		System.out.println(count);
		
}
}
