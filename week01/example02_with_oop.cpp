// In this example, data and the function that operates on the data are encapsulated inside Student data type

#include <iostream>
#include <string>
using namespace std;

// data type with a function bundled together
struct Student{
    string name;
    int id;
    double gpa;
    
    void print(){
        cout << "{name: " << this->name;
        cout << ", id: " << this->id;
        cout << ", gpa: " << this->gpa;
        cout << "}" << endl;   
    }

};

int main(){
   Student alice = {"Alice", 56789, 4.0};
   Student bob = {"Robert", 54321, 2.9};
   Student john = {"Muhammedjohn", 12345, 3.5};
   alice.print();
   bob.print();
   john.print();
}
