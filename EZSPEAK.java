/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class EZSPEAK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<=t-1;i++)
		{
		    int l=sc.nextInt();
		    String s=sc.next(); 
		
            int c=0; 
		   if(l<4)
		   System.out.println("YES");
		   else{
		    for(int a=0;a<=l-1;a++)
		    {
		        if((s.charAt(a)=='a') || (s.charAt(a)=='e') || (s.charAt(a)=='i') || (s.charAt(a)=='o') || (s.charAt(a)=='u'))
		       c=0;
		        else
		        c=c+1;
		        if(c>=4)
		        break;
		    }
	
	            if(c>=4)
	                System.out.println("NO");
	                else
                	System.out.println("YES");
                  
		}
		    
		}
	}
}
