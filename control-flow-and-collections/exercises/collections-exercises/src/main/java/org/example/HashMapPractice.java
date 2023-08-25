package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter student information (or 0 to finish): ");

        Integer studentID;
        do {
            System.out.print("ID number: ");
            studentID = input.nextInt();
            if (!(studentID == 0)) {
                System.out.print("Student name: ");
                String studentName = input.next();
                students.put(studentID, studentName);
                input.nextLine();
            }
        } while (studentID != 0);
        input.close();

        System.out.println("\nClass Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());

        }
    }
}
