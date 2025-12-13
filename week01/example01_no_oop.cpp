// In this example, data and the function that operates on the data are separate

#include <iostream>
#include <string>
using namespace std;

// data type
struct Student{
    string name;
    int id;
    double gpa;
};

// function
void print(Student student){
    cout << "{name: " << student.name;
    cout << ", id: " << student.id;
    cout << ", gpa: " << student.gpa;
    cout << "}" << endl;   
}

int main(){
   Student alice = {"Alice", 56789, 4.0};
   Student bob = {"Robert", 54321, 2.9};
   Student john = {"Muhammedjohn", 12345, 3.5};
   print(alice);
   print(bob);
   print(john);
}
