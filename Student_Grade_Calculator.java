import java.util.*;
public class Student_Grade_Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in each subject:\n");
        System.out.print("English: ");
        int sub1 = sc.nextInt();
        System.out.print("Mathematics: ");
        int sub2 = sc.nextInt();
        System.out.print("Science: ");
        int sub3 = sc.nextInt();
        System.out.print("Social Studies: ");
        int sub4 = sc.nextInt();
        System.out.print("Computer: ");
        int sub5 = sc.nextInt();

        if (sub1>100 || sub2>100 || sub3>100 || sub4>100 || sub5>100 ){
            System.out.println("Subject marks cannot exceed 100. Please enter valid marks within the range of 0-100 !!");
            return;
        }

        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        double avg = total/5;

        char grade;
        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 70)
            grade = 'C';
        else if (avg >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n------------------------");
        System.out.println("Subject-wise Marks Summary");
        System.out.println("------------------------");
        System.out.println("English:\t\t" + sub1);
        System.out.println("Mathematics:\t\t" + sub2);
        System.out.println("Science:\t\t" + sub3);
        System.out.println("Social Studies:\t\t" + sub4);
        System.out.println("Computer:\t\t" + sub5);
        System.out.println("------------------------");
        System.out.println("Total Marks:\t\t" + total);
        System.out.println("Average Percentage:\t" + avg);
        System.out.println("Grade:\t\t\t" + grade);
        
        System.out.println("\nFeedback:");
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance! Keep up the good work!");
                break;
            case 'B':
                System.out.println("Well done! You are doing great!");
                break;
            case 'C':
                System.out.println("Good effort! There's always room for improvement.");
                break;
            case 'D':
                System.out.println("Work harder to improve your grades.");
                break;
            case 'F':
                System.out.println("We need to work together to improve your grades.");
                break;
        }
    }
}