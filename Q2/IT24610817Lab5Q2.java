import java.util.Scanner;
 
public class IT24610817Lab5Q2{
    public static void main(String[] args){
            int numMembers;
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of new members introduced: ");
         numMembers = input.nextInt();
         switch (numMembers) {
          
             case 0:
         System.out.println();
         System.out.println("No Price");
             
              break;

               case 1:
         System.out.println();
         System.out.println("Price is a : Pen");
             
              break;

              case 2:
         System.out.println();
         System.out.println("Price is a : Umbrella");
             
              break;

              case 3:
         System.out.println();
         System.out.println("Price is a : Bag");
             
              break;
 
              case 4:
         System.out.println();
         System.out.println("Price is a : Travelling Chair");
             
              break;

              case 5:
         System.out.println();
         System.out.println("Price is a : Headphone");
             
              break;

            default:
                if (numMembers >= 5) {
             System.out.println();
             System.out.println("Price is a : Headphone");
               }
            else { 
              System.out.println("Input must be a number 0 or greater");
            }
                break;
         }
     }
}
