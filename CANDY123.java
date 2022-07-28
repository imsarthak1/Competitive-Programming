/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t , a , b;
        t = sc.nextInt();
        while (t-- >0) {
            a = sc.nextInt();
            b = sc.nextInt();
            int count = 0,la=0,lb=0;
            while ((la<=a)&&(lb<=b)) {
                count++;
                la = la+count;
                count++;
                lb = lb+count;
            }if (la>a) {
                System.out.println("Bob");
            }else{
                System.out.println("Limak");
            }
            
        }
	}
}
