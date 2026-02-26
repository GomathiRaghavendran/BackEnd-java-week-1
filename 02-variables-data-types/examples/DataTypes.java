/**
 * Exercises:
 * -----------------------------------------------------------------
 * 1. Create an int variable called age and assign it your age.
 * 2. Create a double variable called temperature and assign it any decimal number.
 * 3. Create a char variable called gradeLetter and assign it a letter (e.g., 'B').
 * 4. Create a boolean variable called isJavaFun and assign it true or false.
 *
 * 5. Create a String variable called favoriteColor and assign it any color.
 * 6. Create an array of type int called numbers with at least 5 values, then print them.
 * 7. Change one of the values inside the array and print the updated array.
 *
 * Bonus:
 * 8. Create a String array with 3 of your favorite foods and print them in a loop.
 * 9. Create two double variables, add them together, and print the result.
 * 10. Use String concatenation to print a sentence like: "My name is John and I am 20 years old."
 * -----------------------------------------------------------------
 */

public class DataTypesE
{
    public static void main(String[] args)
    {
        // --- Primitive Data Types ---
        int myInt = 10;
        double myDouble = 10.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // --- Non-Primitive Data Types ---
        String myString = "Hello, World!";
        int[] grades = {90, 85, 88};

        // --- Displaying the values ---
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + myString);
        System.out.print("Array of grades: ");
        for (int grade : grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println();

        // -------------------- Student Exercises --------------------
        // 1. Create an int variable called age and assign it your age

        int age=25;
        System.out.println("age: "+ age);

        // 2. Create a double variable called temperature and assign it any decimal
        double temperature=38.7;
        System.out.println("temperature: "+temperature);

        // 3. Create a char variable called gradeLetter and assign it a letter

        char gradeLetter='A';
        System.out.println("Grades: "+gradeLetter);

        // 4. Create a boolean variable called isJavaFun and assign true or false

        boolean isJavaFun=true;
        System.out.println("is Java Fun?: "+true);


        // 5. Create a String variable called favoriteColor and assign it a color

        String favoriteColor="blue";
        System.out.println("my favoriteColor is: "+favoriteColor);

        // 6. Create an int array called numbers with at least 5 values, then print them
        int[] marks={85, 35, 90, 75, 60};
        for (int i=0;i< marks.length;i++)
        {
            System.out.print(marks[i] + " ");

        }
        System.out.println();

        // 7. Change one value inside numbers and print the updated array

        int[] numbers = {85, 35, 90, 75, 60};

// Change value at index 1 (35 → 45)
        numbers[4] = 45;


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
           // numbers[i] +=10;
           // System.out.println(numbers[i]+" ");
        }


        System.out.println();


        // 8. Create a String array with 3 favorite foods and print them in a loop

        String[] foods={"Pasta","Pizza","Cookies"};
        for(int i=0;i<foods.length;i++)
        {
            System.out.println(foods[i]+" ");
        }

        // 9. Create two double variables, add them together, and print the result
        double num1=35.56;
        double num2=60.60;
        double sum= num1+num2;
        System.out.println("Sum of double numbers are: "+ sum);


        // 10. Use String concatenation to print: "My name is ___ and I am ___ years old."

        String name="Gomathi";
        int age1= 38;
        System.out.println("My name is "+ name+" and I am "+age1 +" years old");
    }
}
