package system.school.objects;

public class Staff extends Person {
    private String role;
    private String password;
    private int salary;


//   Constructor of the Staff class. Staff inherits from the Person object because each staff is a person.
    public Staff(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(name, gender, year_of_birth);
        this.role = role;
        this.password = password;
        this.salary = salary;
    }

//  getter of the staff class.
    public int getId() {
        return super.getId();
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return super.getName();
    }

    public int getSalary() {
        return salary;
    }

    public int getYear_of_birth() {
        return super.getYear_of_birth();
    }
}
