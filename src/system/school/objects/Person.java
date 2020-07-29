package system.school.objects;

public class Person {
    private int id;
    private String name;
    private String gender;
    private int year_of_birth;


//    Constructor of the Person class
    public Person(String name, String gender, int year_of_birth) {
        this.name = name;
        this.gender = gender;
        this.year_of_birth = year_of_birth;
    }


//    Getters and setters of the Person class.
    public void setId(int id) { this.id = id;
        return;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    protected String getGender() {
        return gender;
    }
}
