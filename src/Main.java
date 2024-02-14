import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the first number: ");
      double number1 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("Enter the second number: ");
      double number2 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("What operation do you want to perform? ");
      String operation = scanner.nextLine();

      if (operation.equals("sum")) {
         System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
      } else if (operation.equals("sub")) {
         System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
      } else if (operation.equals("mul")) {
         System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
      } else if (operation.equals("div")) {
         if (number2 == 0) {
            System.out.println("Cannot divide number by zero.");
         } else {
            System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
         }
      } else {
         System.out.printf("%s is not a supported operation", operation);
      }

      //System.out.println(number1);

      //System.out.println(number2);

      scanner.close();

      }
   }

