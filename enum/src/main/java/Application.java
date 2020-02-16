import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Linda", Sex.FEMALE),
                new Student("Bob", Sex.MALE),
                new Student("Solider", Sex.MALE),
                new Student("Solider", Sex.MALE)
        );

        for (Student student : students) {
            if (student.getSex() == Sex.FEMALE) {
                System.out.println(student);
            }
        }
    }
}
