// Parent Class
package OOPS;

class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child Class
class Dog extends Animal {
    String breed;

    // Constructor
    Dog(String name, String breed) {
        super(name); // Call the constructor of the parent class
        this.breed = breed;
    }

    // Overriding Method
    @Override
    void makeSound() {
        super.makeSound(); // Call parent class method
        System.out.println(name + " barks. Breed: " + breed);
    }
}

// Main Class
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy", "Labrador");
        myDog.makeSound();
    }
}
