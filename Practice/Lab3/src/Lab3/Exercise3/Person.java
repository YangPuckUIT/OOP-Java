package Lab3.Exercise3;

public class Person {
    protected String fullName;
    protected int age;

    // constructor
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // hiển thị thông tin
    public void display() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
    }
}