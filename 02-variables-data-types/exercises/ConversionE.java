/**
 * Exercises:
 * ----------------------------------------------------------------
 * 1. Create a short variable with any value and assign it to an int (implicit).
 * 2. Create an int variable with a large value and assign it to a long (implicit).
 * 3. Create a long variable and assign it to a float (implicit).
 *
 * 4. Create a double variable and cast it to a float (explicit).
 * 5. Create an int variable and cast it to a short (explicit).
 * 6. Create a long variable and cast it to a byte (explicit).
 *
 * Bonus:
 * 7. Try converting a large int (e.g., 1000) to a byte and observe what happens (overflow).
 * 8. Convert a char (e.g., 'Z') into an int and print its ASCII value.
 * 9. Convert an int into a char and print the resulting character.
 * 10. Create a double with decimals, convert it to int, and explain what happens.
 * ----------------------------------------------------------------
 */

public class ConversionE
{
    public static void main(String[] args)
    {
        // --- Implicit Conversions (Widening) ---
        int intValue = 100;
        double widenedDouble = intValue; // int to double
        char letter = 'A';
        int widenedInt = letter;         // char to int (ASCII/Unicode value)

        System.out.println("=== Implicit (Widening) Conversions ===");
        System.out.println("int (" + intValue + ") → double: " + widenedDouble);
        System.out.println("char ('" + letter + "') → int: " + widenedInt);

        // --- Explicit Conversions (Narrowing) ---
        double doubleValue = 9.78;
        int narrowedInt = (int) doubleValue; // double to int (fraction lost)
        float floatValue = 130.75f;
        byte narrowedByte = (byte) floatValue; // float to byte (overflow possible)

        System.out.println("\n=== Explicit (Narrowing) Conversions ===");
        System.out.println("double (" + doubleValue + ") → int: " + narrowedInt);
        System.out.println("float (" + floatValue + ") → byte: " + narrowedByte);

        // -------------------- Student Exercises --------------------
        // 1. Create a short variable with any value and assign it to an int (implicit)
        short a=-32767;
        int b= a;
        System.out.println("short (" + a + ") → int: " + b);

        // 2. Create an int variable with a large value and assign it to a long (implicit)
        int x=1405220386;
        long y=x;
        System.out.println("int ("+x+ ") -> long: "+y);



        // 3. Create a long variable and assign it to a float (implicit)

        long l=250819140586l;
        float f= l;
        System.out.println("long ("+l+")-> float: "+f);

        // 4. Create a double variable and cast it to a float (explicit)
        double d=3.14159834512356789017;
        float f1= (float) d;
        System.out.println("double("+d+")-> float: "+f1);


        // 5. Create an int variable and cast it to a short (explicit)
        int i=10000;
        short s= (short) i;
        System.out.println("int("+i+")-> short: "+s);


        // 6. Create a long variable and cast it to a byte (explicit)
        long l1=142522110225l;
        byte b1= (byte) l1;
        System.out.println("long ("+l1+")-> byte: "+b1);

        // 7. Try converting a large int (e.g., 1000) to a byte and print the result
        long l2=1000l;
        byte b2=(byte) l2;
        System.out.println("long ("+l2+")-> byte: "+b2);

        // 8. Convert a char (e.g., 'Z') into an int and print its ASCII value
        char myLetter='z';
        int asciiValue= myLetter;
        System.out.println("ASCII value of: ("+myLetter+")->int: "+asciiValue);


        // 9. Convert an int into a char and print the resulting character
        int num=69;
        char ch= (char) num;
        System.out.println("Num value of: ("+num+")->char: "+ch);


        // 10. Create a double with decimals, convert it to int, and print the result
        double d2=3.141526374859012456789;
        int i1= (int) d2;
        System.out.println("("+d2+")-> int: " +i1);


    }
}
