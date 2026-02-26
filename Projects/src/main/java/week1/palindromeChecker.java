package week1;

import java.util.Scanner;

public class palindromeChecker {
    public static <string> void main(String[] args) {
     Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str= scanner.next();

        boolean isPalindrome=true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
        scanner.close();
    }

}



