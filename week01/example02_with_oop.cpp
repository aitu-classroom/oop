// In this example, data and the functions that operate on the data are encapsulated inside
// Student structure and access is controlled via special methods called getters and setters

#include <iostream>
#include <string>
using namespace std;

// data type with a function bundled together
struct Student{
    private: 
        string name;
        int id;
        double gpa;
        
    
    public:
        void print(){
            cout << "{name: " << this->name;
            cout << ", id: " << this->id;
            cout << ", gpa: " << this->gpa;
            cout << "}" << endl;   
        }
        
        string get_name(){ return name; }
        void set_name(string name){ this->name=name; }
        
        int get_id(){ return id; }
        void set_id(int id){ this->id=id; }
        
        double get_gpa(){ return gpa; }
        void set_gpa(double gpa){ this->gpa=gpa; }
        
        // a constructor
        Student(string name, int id, double gpa){
            this->name=name;
            this->id=id;
            this->gpa=gpa;
        }
};

int main(){
   Student alice = {"Alice", 56789, 4.0};
   Student bob = {"Robert", 54321, 2.9};
   Student john = {"Muhammedjohn", 12345, 3.5};
   
   alice.print();
   bob.print();
   john.print();
   
   john.set_gpa(4.0);
   
   cout << "john.name = " << john.get_name() << endl;
   cout << "john.id = " << john.get_id() << endl;
   cout << "john.gpa = " << john.get_gpa() << endl;
}

   Student alice = {"Alice", 56789, 4.0};
   Student bob = {"Robert", 54321, 2.9};
   Student john = {"Muhammedjohn", 12345, 3.5};
   alice.print();
   bob.print();
   john.print();
}
