import java.util.Scanner;

public class BankBalance{
   public static void main(String[] args){
   
   double balance;
   int response;
   int year = 1;
   final double INT_RATE = 0.03;
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Enter initial bank balance: ");
   balance =  scanner.nextDouble();
   
   System.out.println("Do you want to see next year's balance? ");
   System.out.println("Enter 1 for yes" );
   System.out.println("or any number for no >> ");
   response = scanner.nextInt();
   
   while(response == 1){
   balance = balance + balance * INT_RATE;
   System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is Php" + balance);
   year = year + 1;
   System.out.println("\nDo you want to see the balance " + "at the end of another year?");
   System.out.println("Enter 1 for yes");
   System.out.println("or any number for no >>");
   response = scanner.nextInt();
   
   }
   
   
   }
}