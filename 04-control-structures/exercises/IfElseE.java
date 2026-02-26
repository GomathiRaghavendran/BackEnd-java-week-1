import java.util.Scanner;

/**
 * Exercises:
 * -------------------------------------------------------------
 * 1. Create an int variable x and check if it is even or odd using if-else.
 *
 * 2. Create an int variable age.
 *    - If age >= 18, print "Adult".
 *    - Else, print "Minor".
 *
 * 3. Create an int variable score (0-100).
 *    - Use if-else to assign grades:
 *      >=90 -> "A"
 *      >=75 -> "B"
 *      >=50 -> "C"
 *      <50  -> "F"
 *
 * 4. Create a double variable temperature.
 *    - If temperature > 30, print "Hot".
 *    - Else if temperature >= 20, print "Warm".
 *    - Else, print "Cold".
 *
 * Bonus:
 * 5. Combine two conditions using logical operators:
 *    - Check if a number n is positive **and** even.
 * -------------------------------------------------------------
 */

public class IfElseE {


    public static void main(String[] args) {
      /*  int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }*/

        // -------------------- Student Exercises --------------------
        // 1. Check if x is even or odd.


        /** Scanner scanner = new Scanner(System.in);

         System.out.print("Enter an the value of X: ");

         int x = scanner.nextInt();

         if (x % 2 == 0) {
         System.out.println("X is an Even no");
         } else {
         System.out.println("x is an Odd no");
         }
         scanner.close();*/


        // 2. Check age and print "Adult" or "Minor".

        /** Scanner scanner1 = new Scanner(System.in);

         System.out.println("Enter the value of Age: ");
         int age = scanner1.nextInt();

         System.out.println(age > 18 ? "Adult" : "Minor");

         scanner1.close();*/


// 3. Assign grades based on score using if-else if-else.
        /**Use if-else to assign grades:
         *      >=90 -> "A"
         *      >=75 -> "B"
         *      >=50 -> "C"
         *      <50  -> "F"*/
        /** Scanner scanner2 = new Scanner(System.in);

         System.out.println("Enter the value of scores: ");

         int score = scanner2.nextInt();

         if(score<=0 || score>100) {
         System.out.println("Invalid score");
         } else if (score>=90) {

         System.out.println("Score is Grade A");
         }
         else if (score>=75) {
         System.out.println("Score is Grade B");
         } else if (score>=50) {
         System.out.println("Score is Grade C");
         }
         else {
         System.out.println("Score is F");
         }
         scanner2.close();*/


        // 4. Check temperature and print "Hot", "Warm", or "Cold".

        /**- If temperature > 30, print "Hot".
         *    - Else if temperature >= 20, print "Warm".
         *    - Else, print "Cold".*/
        /** Scanner scanner4 = new Scanner(System.in);

         System.out.println("Enter the value of temperature: ");

         int temp = scanner4.nextInt();
         if (temp > 30) {
         System.out.println("Temperature is Hot");
         } else if (temp >= 20) {
         System.out.println("Temperature is Warm");
         } else
         System.out.println("Temperature is Cold");

         scanner4.close();*/


        // 5. Check if n is positive AND even using logical operators.

        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Enter the value of number: ");
        int n = scanner5.nextInt();

        if (n > 0 && n != 0) {

            System.out.println("n is positive");
        } else if (n < 0) {
            System.out.println("n is negative");
        } else {
            System.out.println("n is zero");
            scanner5.close();


        }
    }
}



