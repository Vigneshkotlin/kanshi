/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int a=s.nextInt();
        if(a>=1 && a<=10000)
        {
            System.out.println("Postive"); 
        }else if(a<0)
        {
            System.out.println("negative");
        }else
        {
            System.out.println("zero");   
        }
	}
}
