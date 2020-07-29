package system.school.objects;

public class Staff extends Person {
    private String role;
    private String password;
    private int salary;

    public Staff(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(name, gender, year_of_birth);
    }


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

    public String getPassword() {
        return password;
    }

    public int getYear_of_birth() {
        return super.getYear_of_birth();
    }
}
