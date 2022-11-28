//Enhanced for Loop


/*Your company is writing a program for a geometry course.
The program takes the number of squares as the first input, creates an array, and then takes the sides of squares as its elements.
Write the part of the program that receives a list of square sides and prints the area of those squares for the user.

Sample Input
2
3
4

Output
9
16

Explanation
In this example we have 2 squares (the first input) and their sides accordingly - 3 and 4 (the second and the third inputs). The area of the first square is 9 (3*3), the second one 16 (4*4).
The area of a square is a square of its edges.*/
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the no of squares taken by gemontry program:");
       int length = scanner.nextInt();
       int[] sides =  new int[length];
	   
       for (int i = 0; i < length; i++) {
		   System.out.println("Enter the input");
           sides[i] = scanner.nextInt();
            int square=sides[i] *sides[i];
            System.out.println(square);
       }
       
       
          
       
      //your code goes here
      
   }
}