package case_study.models;

public class Employee extends Person {
    private String academicLevel;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String academicLevel, String position, String salary) {
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String dateOfBirth, String sex, String nationalId, String phoneNumber, String email, String academicLevel, String position, String salary) {
        super(id, name, dateOfBirth, sex, nationalId, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
