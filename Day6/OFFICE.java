/* package codechef; // don't place package name! */
/*Recently Chef joined a new company. In this company, the employees have to work for 
�
X hours each day from Monday to Thursday. Also, in this company, Friday is called Chill Day — employees only have to work for 
�
Y hours 
 Saturdays and Sundays are holidays.

Determine the total number of working hours in one week.*/

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
	      int y=sc.nextInt();
	      
	       System.out.println((x*4)+y);
	      
	}
	}
}
