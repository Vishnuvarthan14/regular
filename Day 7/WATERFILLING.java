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
	    int b1=sc.nextInt();
	    int b2=sc.nextInt();
	    int b3=sc.nextInt();
	    if(b1==0&&b2==0&&b3==0)
	    System.out.println("Water filling time");
	    else if (b1==0&&b2==0||b2==0&&b3==0||b1==0&&b3==0) 
	    System.out.println("Water filling time");
	    else
	    System.out.println("Not now");
	}
	}
}
