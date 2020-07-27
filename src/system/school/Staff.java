package system.school;

public class Staff {
    private int id;
    private String role;
    private String name;
    private String gender;
    private String password;
    private int salary;
    private int year_of_birth;

    public Staff(String role, String name, String gender, int salary, int year_of_birth, String password) {
        this.role = role;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.salary = salary;
        this.year_of_birth = year_of_birth;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }
}
