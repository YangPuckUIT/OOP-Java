package Lab4.Exercise3;

// class lưu tên với blood type

public class Person {

    private String name;
    private BloodType bloodType;

    public Person(String name, BloodType bloodType) {
        this.name = name;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public BloodType getBloodType() {
        return bloodType;
    }
}