package system.school;

public abstract class Non_Academic extends Staff implements Authorizations{


    public Non_Academic(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }
}
