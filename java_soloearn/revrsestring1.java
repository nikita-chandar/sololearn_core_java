/*Write a Java program to reverse a word. Go to the editor
Sample Output:

Input a word: dsaf
Reverse word: fasd
Click me to see the solutionWrite a Java program to reverse a word. Go to the editor
Sample Output:

Input a word: dsaf
Reverse word: fasd
Click me to see the solution
*/
import java.util.Scanner;
class demo
{
	public static void main(String[] args)
	{
		System.out.println("Entre the string");
		String str="dsaf" ,revstr=" ";
		

		for(int i=str.length()-1;i>=0;i--)
		   {
			   revstr=revstr+str.charAt(i);
			   
		   }
		   System.out.println("revrse word :"+revstr);
	}
}