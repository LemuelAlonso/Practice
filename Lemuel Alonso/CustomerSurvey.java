import java.util.Scanner;

public class CustomerSurvey{
   public static void main(String[] args){
   int rating;
   final int MIN = 1;
   final int MAX = 10;
   
   Scanner scanner = new  Scanner(System.in);
   
   System.out.println("Please enter a value that represents your satisfaction with our service.");
   System.out.println("Enter a value between " + MIN + " and " + MAX);
   System.out.println("with" + MAX + " meaning highly satisfied and " + MIN + " meaning not at all satisfied");
   System.out.println("Enter your rating: ");
   
   rating = scanner.nextInt();
   
   while(rating < MIN || rating > MAX){
   System.out.println("You must enter a value between " + MIN + " and " + MAX);
   System.out.println("Please try again >>");
   rating = scanner.nextInt();
   }
   
   System.out.println("Thank you.");
   
   }
}