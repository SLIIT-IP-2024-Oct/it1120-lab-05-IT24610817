import java.util.Scanner;
public class IT24610817Lab5Q3{
     public static void main(String[] args){
          final double ROOM_CHARGE_PER_DAY = 48000.00;
          final double DISCOUNT_3_TO_4_DAYS = 0.1;
          final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

          int startDate,endDate,numberOfDaysReserved;
          double totalAmountBeforeDiscount,discountAmount,totalAmountToBePaid;
 
          double discountRate = 0;

          Scanner input = new Scanner(System.in);

          System.out.print("Enter start Date (1-31); ");
          startDate = input.nextInt();

          System.out.print("Enter End Date (1-31); ");
          endDate = input.nextInt();

          if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
             System.out.print("Error: Days must be between 1 and 31");

             return;
          }
          
          if (startDate >= endDate) {
             System.out.println("Error: Start Date must be less than End Date");

             return;
          }

           numberOfDaysReserved = endDate - startDate;

           if (numberOfDaysReserved >=3 && numberOfDaysReserved <= 4) {
              discountRate = DISCOUNT_3_TO_4_DAYS;
           }
           else if (numberOfDaysReserved >= 5) {
               discountRate = DISCOUNT_5_OR_MORE_DAYS;
           }

           totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
           discountAmount = totalAmountBeforeDiscount * discountRate;
           totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

           System.out.println();
           System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
           System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
           System.out.println ("Total Amount to be Paid: " + totalAmountToBePaid);
         }
} 