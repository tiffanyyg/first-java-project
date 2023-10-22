package akpac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i+1) + ":");
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            // Input for CW001
            System.out.println("Enter marks for module CW001:");
            CW001 cw001 = new CW001("CW001", 0);
            System.out.print("Enter Homework 1 Mark: ");
            cw001.setHomework1(scanner.nextDouble());
            System.out.print("Enter Homework 2 Mark: ");
            cw001.setHomework2(scanner.nextDouble());
            System.out.print("Enter Homework 3 Mark: ");
            cw001.setHomework3(scanner.nextDouble());
            System.out.print("Enter Project Mark: ");
            cw001.setProject(scanner.nextDouble());
            cw001.calculateFinalMark();
            scanner.nextLine();

            // Input for EX002
            System.out.println("Enter marks for module EX002:");
            EX002 ex002 = new EX002("EX002", 1);
            System.out.print("Enter Exam Mark: ");
            ex002.setExam(scanner.nextDouble());
            ex002.calculateFinalMark();
            scanner.nextLine();

            // Input for CE003
            System.out.println("Enter marks for module CE003:");
            CE003 ce003 = new CE003("CE003", 2);
            System.out.print("Enter Homework 1 Mark: ");
            ce003.setHomework1(scanner.nextDouble());
            System.out.print("Enter Homework 2 Mark: ");
            ce003.setHomework2(scanner.nextDouble());
            System.out.print("Enter Homework 3 Mark: ");
            ce003.setHomework3(scanner.nextDouble());
            System.out.print("Enter Homework 4 Mark: ");
            ce003.setHomework4(scanner.nextDouble());
            System.out.print("Enter Exam Mark: ");
            ce003.setExam(scanner.nextDouble());
            ce003.calculateFinalMark();
            scanner.nextLine();

            // Creating Student object
            students[i] = new Student(firstName, lastName, cw001, ex002, ce003);

            System.out.println();
        }

     // Print marks
        System.out.println("Do you want to print marks for a single module (1) or for all modules (2)?");
        int choice = scanner.nextInt();
        scanner.nextLine();
        String table = "";
        if (choice == 1) {
            System.out.print("Enter the module name: ");
            String moduleName = scanner.nextLine();
            table += String.format("+------------+-----------------+-----------------+-----------------+-----------------+-----------------+\n");
            table += String.format("| %-10s | %-15s | %-15s | %-15s | %-15s | %-15s |\n", "Module", "First Name", "Last Name", "Marks", "Weight", "Final Mark");
            table += String.format("+------------+-----------------+-----------------+-----------------+-----------------+-----------------+\n");
            for (Student student : students) {
                table += student.getModuleMarks(moduleName);
            }
            table += String.format("+------------+-----------------+-----------------+-----------------+-----------------+-----------------+\n");
        } else if (choice == 2) {
            table += String.format("+------------+-----------------+-----------------+-----------------+\n");
            table += String.format("| %-10s | %-15s | %-15s | %-15s |\n", "Module", "First Name", "Last Name", "Final Mark");
            table += String.format("+------------+-----------------+-----------------+-----------------+\n");
            for (Student student : students) {
                table += student.toString();
            }
            table += String.format("+------------+-----------------+-----------------+-----------------+\n");
        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println(table);

        
    }   
}      
