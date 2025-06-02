package OOPS;

class Student { // creating class
    String name;// field or data
    int age;

    // then create a constructor
    Student(String n, int a) {
        name = n;// it will run automatically when an object is created
        age = a;
    }

    void display() {// creating method to display student info
        System.out.println(name);
        System.out.println(age);
    }
}

public class Constructor { // separate class with main method
    public static void main(String args[]) {
        Student s1 = new Student("Nirali", 20); // creating obj and passing vlaues to constructor
        Student s2 = new Student("Suzata", 21);// constructor called here
        // calling display method to show
        s1.display();
        System.out.println("---");
        s2.display();
    }
}