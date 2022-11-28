/*Conditional Statements


You have $12,000 to buy a car.
You're given a program which takes the price of car as an input.

Task
Output "yes" if the price is lower than or equal to 12,000.

Sample Input
11000

Sample Output
yes
Use the if statement to check the required condition.*/
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      int money=12000;
       Scanner scanner = new Scanner(System.in);
	   //complete the code
       
       //System.out.println("Enter the price of car??");
       int price = scanner.nextInt();
       if(price<=money)
       {
           System.out.println("yes");
       }
              

     
   }
}