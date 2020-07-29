package system.school.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a teacher object having the characteristics
 * of teachers of the school.
 */
public abstract class Teacher extends Staff implements Authorizations {

    private List<Course> courses = new ArrayList<>();
    private List<Class> classes = new ArrayList<>();

    public Teacher(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }

    public String teach(Course course) {
        courses.add(course);
        int length = courses.size();
        return courses.get(length - 1).getDuration();
    }

    public String teach(Class aClass){
        classes.add(aClass);
        int length = classes.size();
        return classes.get(length - 1).getDuration();
    }

    public String getName() {
        return super.getName();
    }


    /**
     * This method will create the teacher's id.
     * @param id
     */
    public void setId(int id) {
        super.setId(id);
    }

    /**
     * This method will return the teacher's id.
     * @return
     */
    public int getId() {
        return super.getId();
    }

    /**
     * This method will return the teacher's salary.
     * @return
     */
    public int getSalary() {
        return super.getSalary();
    }

    /**
     * This method will return the teacher's date of birth.
     * @return
     */
    public int getDate_of_birth() {
        return super.getYear_of_birth();
    }

}
