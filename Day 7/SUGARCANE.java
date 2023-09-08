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
	    a=a*50;
	     int sug=((a*20)/100);
	     int salt=((a*20)/100);
	     int rent=((a*30)/100);
	     int tot=sug+salt+rent;
	     System.out.println(a-tot);
	}
	}
}
