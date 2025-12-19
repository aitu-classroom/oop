import aitu.Student;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student noname = new Student();

        System.out.println(noname.getId());
        System.out.println(noname.getFirstname());
        System.out.println(noname.getLastname());
        System.out.println(noname.getGrades());

        Student john = new Student(251234, "John", "Wick", new double[]{2.5,3.7,1.0,4.0});

        System.out.println(john.getId());
        System.out.println(john.getFirstname());
        System.out.println(john.getLastname());
        System.out.println(Arrays.toString(john.getGrades()));
        System.out.println(john.getGradesString());

        System.out.println(john);
    }
}
