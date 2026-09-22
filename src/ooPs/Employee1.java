package ooPs;

public class Employee1 {

    String name;
    int id;

    Employee1(String n, int i) {

        name = n;
        id = i;
    }

    public static void main(String[] args) {

        Employee1 e1 = new Employee1("Shankar",101);

        System.out.println("Name : " + e1.name);
        System.out.println("ID   : " + e1.id);
    }
}





/*   
 
 Interview Questions
What is a Parameterized Constructor?

A constructor that accepts parameters is called a parameterized constructor.

Why Do We Use It?

To initialize object data during object creation.

Difference Between Default and Parameterized Constructor
Default Constructor	Parameterized Constructor
No Parameters	Has Parameters
Student()	Student(String n,int a)
Sets default values	Sets user values
Easy Memory Trick
Default Constructor

Student()

No information passed.

Parameterized Constructor

Student("Shankar",22)

Information passed while creating the object.
 
 
 
   */
 */