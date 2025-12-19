package aitu;

public class Student {
    private int id;             // 0
    private String firstname;   // null
    private String lastname;    // null
    private double [] grades;   // null

    // + implement a no-argument constructor
    public Student(){
        firstname = "first";
        lastname = "last";
    }
    // + implement a 3-parameter constructor (without grades)
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getGradesString(){
        String result = "{";
        for (int i = 0; i < grades.length-1; i++) {
            result += grades[i]+", ";
        }
        result+=grades[grades.length-1]+"}";
        return result;
    }
    // implement a 4-parameter constructor (with grades)

    public Student(int id, String firstname, String lastname, double[] grades) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.grades = grades.clone();
    }

    // hide all fields to achieve "true encapsulation"
    // access modifiers:
    // private = class-visible
    // protected = (package+subclass)-visible
    // (no-modifier) = package-visible
    // public = everywhere-visible

    // add getters for all fields

    public int getId() { return id; }
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public double[] getGrades() { return grades.clone(); }

    // add setters for firstname, lastname, grades
    
    // override toString() method as you wish

    /* implement:
        String getFullName(){} as you wish
        void printTranscript() {} as you wish
        double calculateGpa() {}
        boolean isHonors() {} // e.g. if gpa >= 3.5
        String getEmail(){} // as you wish
     */

    /* in the main method test your aitu.Student class by:
        create a couple of Students
        run all the methods

        create an array of five Students
        populate the array with real student

        print the honors students emails
        find the average gpa etc.

     */
}
