import java.util.Scanner;
public class determiningAInput {



           public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter something: ");

            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                System.out.println("You entered an integer: " + num);
            } else if (sc.hasNextFloat()) {
                float num = sc.nextFloat();
                System.out.println("You entered a float: " + num);
            } else if (sc.hasNextDouble()) {
                double num = sc.nextDouble();
                System.out.println("You entered a decimal number: " + num);
            } else {
                String str = sc.next();
                System.out.println("You entered a string: " + str);
            }
        }
    }

