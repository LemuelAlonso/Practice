import java.util.Scanner;

public class EnterSmallValue{
   public static void main(String[] a){
   
   int userEntry;
   final int LIMIT = 3;
   Scanner scanner = new Scanner(System.in);
   System.out.println("Please enter an integer no higher than  " + LIMIT + " >");
   userEntry = scanner.nextInt();
   
   while(userEntry > LIMIT){
   System.out.println("The number you enteres was too high");
   System.out.println("Please enter an integer no higher than  " + LIMIT + " >");
   userEntry = scanner.nextInt();
   }
   System.out.println("You correctly entered " + userEntry);
   }
}