package ooPs;

public class Employe {

    String name;
    int age;
    int salary;

    Employe() {
        System.out.println("Student Object Created");
    }

    public static void main(String[] args) {

    	Employe e1 = new Employe();

        e1.name = "Shankar";
        e1.age = 22;
        

        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
        System.out.println("salary: " + e1.salary);
    }


	}


