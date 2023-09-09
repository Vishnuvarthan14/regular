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
	        int t=sc.nextInt();
	        int count=0;
	        for(int j=0;j<t;j++)
	        {
	      int [] arr=new int[t];
	           arr[j]=sc.nextInt() ;
	           if(arr[j]>=1000)
	               count++;
	        }
	         System.out.println(count);  
	           
	   }
	}
}
