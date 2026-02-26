package week1;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y=  scanner.nextInt();


        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        //Using if, else-if statement

     /**   if(operation=='+'){
                 System.out.println("addition results: "+(x+y));

        } else if(operation=='-') {

            System.out.println("subtraction results: "+(x-y));

        }else if(operation=='*'){
            System.out.println("multiplication results: "+(x*y));

        } else if (operation == '/') {
            System.out.println("division results: "+(x/y));
        }else{
            System.out.println("invalid operation");
        }*/
        //using Switch statement

        switch(operation){

            case '+':
            System.out.println(" switch addition results: "+(x+y));
            break;
            case '-':
                System.out.println("switch subtraction results: "+(x-y));
                break;
            case '*':
                System.out.println("switch multiplication results: "+(x*y));
                break;
            case '/':
                System.out.println("switch division results: "+(x/y));
                break;
            default:
                System.out.println(" switch invalid operation");
            }
        scanner.close();
    }
}
