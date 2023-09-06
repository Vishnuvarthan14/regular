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
		int n,a,b,c,max,sum;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    	a=sc.nextInt();
		    	b=sc.nextInt();
		    	c=sc.nextInt();
                max=(a>b&&a>c)?a:(b>c&&b>a)?b:c;
                if(a+b==max||b+c==max||c+a==max)
                   System.out.println("yes");
                else
                System.out.println("no");
		}
		
	}
}
