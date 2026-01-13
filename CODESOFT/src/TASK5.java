import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNumber + ", Name: " + name + ", Grade: " + grade;
    }
}

public class TASK5 {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exited.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        students.add(new Student(roll, name, grade));
        System.out.println("Student added.");
    }

    static void removeStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNumber == roll) {
                students.remove(i);
                System.out.println("Student removed.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void searchStudent() {
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.rollNumber == roll) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

