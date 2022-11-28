/*Write a Java program that accepts three integer values and return true 
if one of them is 20 or more and less than the substractions of others.
 Go to the editor
Sample Output:

Input the first number : 15                                            
Input the second number: 20                                            
Input the third number : 25                                            
false*/

import java.util.Scanner;
class Demo
{
	public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Input the first number:");
		  int n1=sc.nextInt();
		   System.out.println("Input the second number:");
		  int n2=sc.nextInt();
		   System.out.println("Input the third number:");
		  int n3=sc.nextInt();
		 System.out.println( m1(n1,n2,n3));
		  
		  
		  
		  
		  
	  }
	  
	  public static boolean m1(int a,int b,int c)
	  {
		  System.out.println((a-b)>=c ||(b-c)>=a || (c-a)>=b);
		  
		   return false ;
	  }
	 
}
