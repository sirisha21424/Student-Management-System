import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n====== STUDENT MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Sort Students by ID");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    manager.addStudent(new Student(id, name, age));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    Student s = manager.searchStudent(searchId);
                    if (s != null)
                        System.out.println(s);
                    else
                        System.out.println("Student not found!");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();

                    manager.updateStudent(uid, newName, newAge);
                    System.out.println("Student Updated!");
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();

                    manager.deleteStudent(did);
                    System.out.println("Student Deleted!");
                    break;

                case 6:
                    manager.sortById();
                    System.out.println("Students Sorted by ID!");
                    break;

                case 7:
                    System.out.println("Exiting System... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}