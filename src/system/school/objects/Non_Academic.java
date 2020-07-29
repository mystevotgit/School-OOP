package system.school.objects;

//    The non academic staff class inherits the staff object (inheritance).
//    The non academic staff implements the authorization interface (Abstraction).
public abstract class Non_Academic extends Staff implements Authorizations {

//    Constructor of the non academic staff class;
    public Non_Academic(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }

//    Getter of the staff's role.
    public String getRole() {
        return super.getRole();
    }

//    getter of the staff's gender.
    public String getGender() {
        return super.getGender();
    }
}
