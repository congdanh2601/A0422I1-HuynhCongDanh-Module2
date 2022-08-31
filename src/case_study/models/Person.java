package case_study.models;

import java.util.Date;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private String sex;
    private String nationalId;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirth, String sex, String nationalId, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
