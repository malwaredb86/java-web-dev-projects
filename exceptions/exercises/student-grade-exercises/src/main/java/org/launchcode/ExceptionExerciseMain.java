package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;


public class    ExceptionExerciseMain {
    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.j");

        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(CheckFileExtension(studentFiles.get("Elizabeth")));
        System.out.println(CheckFileExtension(studentFiles.get("Stefanie")));

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        if (y == 0){
            try {
                throw new ArithmeticException("Cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            int result = x/y;
            System.out.println(result);
        }
        // Write code here!
    }


    public static int CheckFileExtension(String fileName)
    {
        int score = 0;
        if (fileName.isBlank()){
            try {
                throw new FileExtensionException("You need to name your file!");
            } catch (FileExtensionException e) {
                e.printStackTrace();
                score += -1;
            }
        } else if (fileName.contains(".java")) {
            score += 1;
        } else if (!fileName.contains(".java")) {
            score += -1;
        } return score;
        // Write code here!
    }
}