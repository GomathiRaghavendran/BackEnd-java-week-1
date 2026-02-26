package week1;


import java.util.Scanner;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Subjects: ");
        int sub= scanner.nextInt();

        int[] marks = new int[sub];// declaring marks for each subject using array
        int total =0;
        // Reading marks and the total
        for (int i = 0; i < sub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total= total+marks[i];
        }

        //Calculate average:
        int average=total/sub;


        // Printing marks
        System.out.println("Marks entered:");
        for (int i = 0; i < sub; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks: "+total);
        System.out.println("Average of Total: "+average);

        if(average>=80){
            System.out.println("Grade A");
        } else if (average>=60 && average<=79) {
            System.out.println("Grade B");
        } else if (average>=40 && average<=59) {
            System.out.println("Grade C");
        }else{
            System.out.println("Grade F");
        }


    }
}
