//package ooPs;
//
//public class questionAnswer {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

/*
 
 1. What is a Class?

Answer:
A class is a blueprint or template used to create objects.

class Student {
    String name;
    int age;
}
2. What is an Object?

Answer:
An object is an instance of a class.

Student s1 = new Student();

s1 is an object.

3. What is the difference between Class and Object?

Answer:

Class	Object
Blueprint	Real Instance
Logical Entity	Physical Entity
No Memory	Memory Allocated
4. Why do we need a Class?

Answer:
To group data and methods together.

5. Why do we need Objects?

Answer:
Objects store actual data and perform operations.

6. How do you create an Object?

Answer:

Student s1 = new Student();

Using the new keyword.

7. Explain this statement:
Student s1 = new Student();

Answer:

Student → Class
s1 → Object Reference Variable
new → Keyword
Student() → Constructor
8. What is an Instance?

Answer:
Instance means Object.

Student s1 = new Student();

s1 is an instance of Student.

9. Can one Class create multiple Objects?

Answer:
Yes.

Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
10. Can an Object exist without a Class?

Answer:
No.

Every object must be created from a class.

11. Can a Class exist without an Object?

Answer:
Yes.

class Student {
}

No object is created here.

12. What is the new keyword?

Answer:
new creates an object and allocates memory.

13. What is a Constructor?

Answer:
A special method that runs automatically when an object is created.

14. When is a Constructor called?

Answer:
When an object is created.

new Student();
15. What is an Object Reference Variable?

Answer:

Student s1 = new Student();

s1 is an object reference variable.

It points to the object.

16. What are Instance Variables?

Answer:

Variables declared inside a class but outside methods.

class Student {
    String name;
    int age;
}

name and age are instance variables.

17. What memory is allocated when an Object is created?

Answer:

Student s1 = new Student();

Memory is allocated for the object by new Student().

18. Give a real-life example of Class and Object.

Answer:

Class:

class Car {
}

Objects:

Car c1 = new Car();
Car c2 = new Car();

Car = Blueprint

c1, c2 = Real Cars

19. What is the purpose of OOP?

Answer:

Code Reusability
Easy Maintenance
Better Organization
Real-world Modeling
20. Write a program using Class and Object.
public class Employee {

    String name;
    int id;

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.name = "Shankar";
        e1.id = 101;

        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.id);
    }
}
Output
Name: Shankar
ID: 101
 
  
 */
