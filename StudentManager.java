import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    public void updateStudent(int id, String name, int age) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
        }
    }

    public void sortById() {
        Collections.sort(students, Comparator.comparingInt(Student::getId));
    }
}