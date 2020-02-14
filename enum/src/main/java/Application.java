import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Linda", Sex.FEMALE));
        students.add(new Student("Bob", Sex.MALE));
        students.add(new Student("Solider", Sex.MALE));
        students.add(new Student("Cindy", Sex.FEMALE));

        for (Student student : students) {
            if (student.getSex() == Sex.FEMALE) {
                System.out.println(student);
            }
        }
    }
}
