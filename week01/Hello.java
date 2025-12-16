// In this example, data and the methods that operate on the data are encapsulated inside Student class
// and access to the data is controlled via getters and setters.
// rename the file to Hello.java before you run it

public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello Wolrd");

        Student alice = new Student("Alice", 56789, 4.0);
        Student bob = new Student("Robert", 54321, 2.9);
        Student john = new Student("Muhammedjohn", 12345, 3.5);

        john.setGpa(4.0);
        
        alice.print();
        bob.print();
        john.print();        
    }
}

// data: name, id, gpa
// methods: print(), Student()
class Student{
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void print(){
        System.out.println("{name: "+name+", id: "+id+", gpa: "+gpa+"}");
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }

    public double getGpa(){ return gpa; }
    public void setGpa(double gpa){ this.gpa = gpa; }
}
