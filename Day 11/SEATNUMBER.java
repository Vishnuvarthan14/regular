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
	int t=sc.nextInt();
	int j;
	for(int i=0;i<t;i++)
	{
	  	   int x=sc.nextInt();
	  if(x>=1&&x<=10)
	  System.out.println("Lower Double");
	  else if (x>10&&x<=15) 
	  System.out.println("Lower Single");
	  else if (x>=16&&x<=25)
	  System.out.println("Upper Double");
	  else
	  System.out.println("Upper Single");
	}
	  
	}
}
