import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import aitu.Student;

public class StudentReadWrite {
    public static void main() throws Exception {
        Scanner input = new Scanner(new File("src/database.txt"));

        Student [] students = new Student[2500];
        int n = 0;

        PrintStream output = new PrintStream(new File("src/basedata.txt"));

        while(input.hasNext()){
            String first = input.next();
            String last = input.next();
            int id = input.nextInt();
            students[n] = new Student(id,first,last);
            output.println(students[n].getEmail());
            n++;
        }
    }
}
