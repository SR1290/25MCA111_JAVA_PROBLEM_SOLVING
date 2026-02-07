import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_management {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        loadFromFile(); // Load saved data

        int choice;
        do {
            System.out.println("\n===== STUDENT GRADE MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Show Results");
            System.out.println("3. Highest Score");
            System.out.println("4. Average Score");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: showResults(); break;
                case 3: highestScore(); break;
                case 4: averageScore(); break;
                case 5: searchStudent(); break;
                case 6: saveToFile(); System.out.println("Data Saved. Exit."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 6);
    }

    // ADD STUDENT
    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
    
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students.add(new Student(roll, name, marks));
        System.out.println("Student Added Successfully!");
    }

    // SHOW RESULTS
    static void showResults() {
        System.out.println("\nRoll\tName\tMarks\tGrade");
        for (Student s : students) {
            System.out.println(s.roll + "\t" + s.name + "\t"  + s.marks + "\t" + s.grade);
        }
    }

    // HIGHEST SCORE
    static void highestScore() {
        int max = 0;
        for (Student s : students) {
            if (s.marks > max)
                max = s.marks;
        }
        System.out.println("Highest Score: " + max);
    }

    // AVERAGE SCORE
    static void averageScore() {
        int sum = 0;
        for (Student s : students) {
            sum += s.marks;
        }
        System.out.println("Average Score: " + (double) sum / students.size());
    }

    // SEARCH STUDENT
    static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.roll == roll) {
                System.out.println("Roll: " + s.roll);
                System.out.println("Name: " + s.name);
                System.out.println("Marks: " + s.marks);
                System.out.println("Grade: " + s.grade);
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // SAVE DATA TO FILE
    static void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                pw.println(s.roll + "," + s.name + "," + s.marks + "," + s.grade);
            }
        } catch (IOException e) {
            System.out.println("Error saving data!");
        }
    }

    // LOAD DATA FROM FILE
    static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3].charAt(0)
                ));
            }
        } catch (IOException e) {
            System.out.println("Error loading data!");
        }
    }
}
