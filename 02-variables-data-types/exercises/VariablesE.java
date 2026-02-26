/**
 * Exercises:
 * ---------------------------------------------------------------------
 * 1. Create a variable of type 'char' called myLetter and assign it any letter.
 * 2. Create a variable of type 'float' called myFloat and assign it any decimal value.
 * 3. Create a variable of type 'long' called myBigNumber and assign it a large number.
 * 4. Create a variable of type 'byte' called mySmallNumber and assign it a small number.
 * 5. Create a variable of type 'short' called myShortNumber and assign it a number.
 *
 * Bonus:
 * 6. Change the value of an existing variable (for example, myNumber) and print it again.
 * 7. Create two int variables, add them together, and print the result.
 * 8. Create a String variable for your name and print a greeting message using it.
 */

public class VariablesE
{
    public static void main(String[] args)
    {
        // Variable declaration and initialization (already done for you)
        int myNumber = 10;
        String myText = "Hello, World!";
        double myDecimal = 5.99;
        boolean myBoolean = true;

        // Print variables to the console
        System.out.println("Integer: " + myNumber);
        System.out.println("String: " + myText);
        System.out.println("Double: " + myDecimal);
        System.out.println("Boolean: " + myBoolean);


        // -------------------- Student Exercises --------------------
        // 1. Create a char variable called myLetter and assign it any letter
        char myLetter='A';
        System.out.println("char: " + myLetter);

        // 2. Create a float variable called myFloat and assign it any decimal
        float myFloat=99.35f;
        System.out.println("float: "+myFloat);

        // 3. Create a long variable called myBigNumber and assign it a large number
        long myBigNumber=1000000000l;
        System.out.println("long: "+myBigNumber);

        // 4. Create a byte variable called mySmallNumber and assign it a small number
        byte mySmallNumber=127;
        System.out.println("byte: "+mySmallNumber);

        // 5. Create a short variable called myShortNumber and assign it a number
        short myShortNumber=32767;
        System.out.println("short: "+myShortNumber);

        // 6. Change the value of myNumber and print the new value
        int myNumber1=25;
        System.out.println("int: "+myNumber);

        // 7. Create two int variables, add them, and print the result

        int a=50; int b=50;
        int sum=a+b;
        System.out.println("sum of a & b: "+ sum);


        // 8. Create a String variable for your name and print a greeting message

        String myName1="Gomathi";
        String greeting1="Have a Fantastic day!";
        System.out.println("Concatenating the String: "+(myName1 +","+ greeting1));
    }
}
