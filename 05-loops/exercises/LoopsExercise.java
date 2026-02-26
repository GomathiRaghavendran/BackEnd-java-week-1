import java.util.Scanner;

/**
 * Loops Exercises
 * -------------------------------------------------------------
 * 1- For Loop
 * 2- While Loop
 * 3- Do-While Loop
 * 4- For-Each Loop
 * 5- Nested Loops
 * 6- Break and Continue Statements
 *
 * Each exercise is designed to help students practice loops.
 */

public class LoopsExercise<num> {
    public static void main(String[] args) {
        // -------------------- 1. For Loop --------------------
        // Exercise 1:
        // - Create a for loop to print numbers from 10 to 1 (reverse order).
        for (int i = 10; i >= 0; i--) {
            System.out.println("value of i is: " + i);

        }

        // Exercise 2:
        // - Use a for loop to print the multiplication table of 7 (1 to 10).
        for (int i = 1; i <= 10; i++) {
            // System.out.println("value of i: "+i);
            int result = i * 7;
            System.out.println("value of i: " + result);

        }


        // -------------------- 2. While Loop --------------------
        // Exercise 3:
        // - Create a while loop to sum numbers from 1 to 100 and print the total.
        {
            int i = 1;

            int sum = 0;

            while (i <= 100) {
                sum = sum + i;
                i++;
            }

            System.out.println("Sum= " + sum);
        }


        // Exercise 4:
        // - Use a while loop to print all odd numbers between 1 and 20.
        {
            int i = 1;
            int sum = 0;

            while (i <= 20) {
                if (i % 2 != 0) {
                    sum = sum + i;

                }
                i++;
            }

            System.out.println("Sum of odd numbers: " + sum);
        }


        // -------------------- 3. Do-While Loop --------------------
        // Exercise 5:
        // - Create a do-while loop that asks the user to enter a number (simulate with a variable)
        //   and repeats until the number is negative.
        {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("You entered a negative number. Loop stopped.");

        scanner.close();
    }

        // -------------------- 4. For-Each Loop --------------------
        // Exercise 6:
        // - Create an array of colors: {"Red", "Green", "Blue", "Yellow"}.
        //   Use a for-each loop to print each color in uppercase.

        {
            String[] colors = {"Red", "Green", "Blue", "Yellow"};

            for (String color : colors) {
                System.out.println(color.toUpperCase());
            }
        }


        // Exercise 7:
        // - Create an int array {2, 4, 6, 8, 10} and use for-each to calculate the sum.
    /**    {
            int[] num = {2, 4, 6, 8, 10};
            int sum = 0;
            for (int result : num) {
                sum = sum + result;

            }
            System.out.println(sum);
        }
    }*/


 {
         int[] num = {1, 3, 5, 7, 9};
         int sum = 0;
         for (int i=0;i<num.length;i++) {
         sum = sum + num[i];

         }
         System.out.println("sum of Odd numbers: "+sum);
         }





        // -------------------- 5. Nested Loops --------------------
        // Exercise 8:
        // - Use nested loops to print a 3x3 multiplication table (1*1 to 3*3).
        {
            for (int i = 1; i <= 3; i++) {
                // System.out.println("value of i: "+i);
                for (int j = 1; j <= 3; j++) {
                    int result = i * j;
                    System.out.println("value of i*j: " + result);
                }
                System.out.println();



        }
}




        // Exercise 9:
        // - Use nested loops to print the following pattern:
        //   *
        //   **
        //   ***
        //   ****
{

for (int i = 1; i <=4; i++){
         //System.out.println("value of i: "+i);
     for (int j=1;j<=i;j++){
        System.out.print("*");

     }
    System.out.println();
}
    }




        // -------------------- 6. Break and Continue --------------------
        // Exercise 10:
        // - Create a for loop from 1 to 20.
        //   - Skip multiples of 3 using continue.
        //   - Stop the loop if the number is greater than 15 using break.
        {
            for(int i=1;i<=20;i++){
                if(i>15){
                    break;
                }

                if(i%3==0){
                    continue;
                }
                System.out.println(i);
            }
        }



        // Exercise 11:
        // - Use a while loop to print numbers 1 to 10, but stop when a number divisible by 7 is reached.
{
    int i=1;
        while(i<=10){
            if(i%7==0){
                break;
            }
            System.out.println(i);
            i++;
        }
        }
    }
}




