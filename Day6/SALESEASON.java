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
	      int x=sc.nextInt();
	     int max=(x<=100)?x:(x<=1000)?(x-25):(x<=5000)?(x-100):(x-500);
	     System.out.println(max);
	}
	}
}
