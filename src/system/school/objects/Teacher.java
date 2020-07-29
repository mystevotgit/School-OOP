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

//    Constructor of the teacher class.
    public Teacher(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }

    /**
     * Here is an implementation of polymorphism (overloading).
     * the teach method can be used by the teacher to teach a course or teach class.
     * @param course or class
     * @return
     */

    public String teach(Course course) {
        courses.add(course);
        int length = courses.size();
        return courses.get(length - 1).getDuration();
    }

    /**
     * Here is an implementation of polymorphism (overloading).
     * the teach method can be used by the teacher to teach a course or teach class.
     * @param class or course
     * @return
     */

    public String teach(Class aClass){
        classes.add(aClass);
        int length = classes.size();
        return classes.get(length - 1).getDuration();
    }


//    Here are the getters and setters of the teacher's class.

    /**
     * This method will get the teacher's name.
     * @return
     */

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
