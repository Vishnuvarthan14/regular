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
	    int y=sc.nextInt();
	    if(x<=6)
	      {
	          System.out.println(y);
	      }
	      else
	      {
	          if((x%6)==0)
	          {
	              int sub=(x/6)*y;
	              System.out.println(sub);
	          }
	          else
	          {
	              int sub=(x/6)*y;
	              sub=sub+y;
	              System.out.println(sub);
	          }
	      }
	}
	}
}
