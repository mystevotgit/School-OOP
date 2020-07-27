package system.school;

/**
 * This is a teacher object having the characteristics
 * of teachers of the school.
 */
public abstract class Teacher extends Staff implements Authorizations{


    public Teacher(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }

    public String create(Course something) {
        return something.getName();
    }

    public String create(Class newClass){
        return newClass.getCourse();
    }
    @Override
    public void view() {

    }

    public String getName() {
        return super.getName();
    }

    public abstract String teach(Course scrum_fundamentals);


//    public int getId() {
//        return id;
//    }
//    /**
//     * This method will create the teacher's id.
//     * @param id
//     */
//    public void setId(int id) {
//        this.id = id;
//    }
//    /**
//     * This method will return the teacher's id.
//     * @return
//     */
//    public String getName() {
//        return name;
//    }
//    /**
//     * This method will create the teacher's name.
//     * @param name
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//    /**
//     * This method will return the teacher's salary.
//     * @return
//     */
//    public int getSalary() {
//        return salary;
//    }
//    /**
//     * This method will create the teacher's salary.
//     * @param salary
//     */
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//    /**
//     * This method will return the teacher's date of birth.
//     * @return
//     */
//    public String getDate_of_birth() {
//        return date_of_birth;
//    }
//    /**
//     * This method will create the teacher's date of birth.
//     * @param date_of_birth
//     */
//    public void setDate_of_birth(String date_of_birth) {
//        this.date_of_birth = date_of_birth;
//    }
}
