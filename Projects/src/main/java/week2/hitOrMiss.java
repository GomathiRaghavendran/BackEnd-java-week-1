package week2;

import java.util.Scanner;

public class hitOrMiss {
    public static void main(String[] args) {
        //target conditions
        int targetX = 9;
        int targetY = 5;

        Scanner scanner = new Scanner(System.in);



       /** System.out.println("enter the value of x co-ordinate: ");
        int x = scanner.nextInt();

        System.out.println("enter the value of y co-ordinate: ");
        int y = scanner.nextInt();

        if (x == targetX && y == targetY) {
            System.out.println("Wow! you are guess is Hit");
        } else {
            System.out.println("Sorry! wrong guess, pls try again!");
        }*/


//while loop
while(true){

    System.out.println("enter the value of x co-ordinate: ");
    int x = scanner.nextInt();

    System.out.println("enter the value of y co-ordinate: ");
    int y = scanner.nextInt();
        if (x == targetX && y == targetY) {
            System.out.println("Wow! you are guess is Hit");
            break;
        } else {
            System.out.println("Sorry! wrong guess, pls try again!");
        }
    }
scanner.close();

    }
    }
