// In this example, data and the method that operates on the data are encapsulated inside Student class
// rename the file to Hello.java before you run it

public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello Wolrd");

        Student alice = new Student("Alice", 56789, 4.0);
        Student bob = new Student("Robert", 54321, 2.9);
        Student john = new Student("Muhammedjohn", 12345, 3.5);
        
        alice.print();
        bob.print();
        john.print();        
    }
}

// data: name, id, gpa
// methods: print(), Student()
class Student{
    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    void print(){
        System.out.println("{name: "+name+", id: "+id+", gpa: "+gpa+"}");
    }
}
