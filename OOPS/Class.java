package OOPS;

public class Class {
    public static void main(String args[]) {
        Patient Nirali;// obj declaration
        Nirali = new Patient();// instantiation of object
        System.out.println(Nirali.age);
        System.out.println(Nirali.name);
        System.out.println(Nirali.blood);
    }
}

class Patient {
    int age;
    String name;
    char blood;

}