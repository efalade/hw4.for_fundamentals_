package java.Exercise2;

public class Java {
}
import java.util.Scanner;

public class GradeAverageCalculator{
    public static void main ( String []args) {}
    Scanner scanner= new Scanner (System.in);
    int totalGrades=0;
    int gradeCount=0;
    int gradeCount=0;
    System.out.println("Enter student grades (enter 'c' to calculate the average);"))
    //Loop to accept grades from the user
    while(scanner.hasnextInt()) {
        int grade= scanner.nextInt();
        totalGrades +=;
        gradeCount++;

        System.out.println("Enter another grade or 'c' to calculate average:");

        //Calculate and display the average grade
        if( gradeCount>0) {
            double averageGrade= (double) totalGrades/ gradeCount;
            System.out.printif("Average student grade is %.if%n"), averageGrade);
        } else {
            System.out.printf ("Average student is %.if%n", averageGrade);
        }
    }
}