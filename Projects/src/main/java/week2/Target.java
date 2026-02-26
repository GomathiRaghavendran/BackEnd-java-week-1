package week2;

import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        int targetX = 5;
        int targetY = 8;

        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the value of x co-ordinate: ");
        int userX = scanner.nextInt();

        System.out.println("enter the value of y co-ordinate: ");
        int userY = scanner.nextInt();

        while (true) {

            /**  System.out.println("enter the value of x co-ordinate: ");
             int x = scanner.nextInt();

             System.out.println("enter the value of y co-ordinate: ");
             int y = scanner.nextInt();*/
            if (userX == targetX && userY == targetY) {
                System.out.println("Wow! you are guess is Hit");
                break;
            } else {
                System.out.println("Sorry! wrong guess, pls try again!");
                break;
            }


        }
    }
}

