import java.util.Scanner;
public class IT24610817Lab5Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
         int num1 , num2 , num3 ;
         int smallest , largest ;
         System.out.print("Enter the first number: ");
         num1 = input.nextInt();

         System.out.print("Enter the second number:");
         num2 = input.nextInt();

         System.out.print("Enter the third number:");
         num3 = input.nextInt();
         
         smallest = num1;
         largest = num1;
         if (num2<smallest) {
            smallest = num2;
         }
         if (num2>largest) {
            largest = num2;
         }
         if (num3<smallest){
            smallest = num3;
         }
         if (num3>largest){
            largest = num3;
         }
         System.out.println("The largest number is:"+largest);
         System.out.println("The smallest number is"+smallest);
    }
    
}
