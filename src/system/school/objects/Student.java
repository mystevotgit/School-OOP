package system.school.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a student object having the characteristics
 * of students of the school.
 */

public class Student extends Person {

    private String level;
    private int feesPaid = 0;
    private final int feesTotal = 3_000_000;
    private List<Course> courses = new ArrayList<>();

    /**
     * @param name
     * @param gender
     * @param year_of_birth
     * @param level
     */

    public Student(String name, String gender, int year_of_birth, String level) {
        super(name, gender, year_of_birth);
        this.level = level;
    }


    /**
     *
     * @return will return the student's id.
     */

    public int getId() {
        return super.getId();
    }

    /**
     * This method will create the student's id.
     * @param id
     */

    public void setId(int id) {
        super.setId(id);
    }

    /**
     *
     * @return will return the student's name.
     */

    public String getName() {
        return super.getName();
    }

    /**
     *
     * @return will return the student's level.
     */

    public String getLevel() {
        return level;
    }

    /**
     * This method will create the student's level.
     * @param level
     */

    public void updateLevel(String level) {
        this.level = level;
    }

    /**
     *
     * @return will return the amount paid by the student so far.
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * This method will update the fees paid by the student.
     * Total fee to be paid is #3,000,000.
     * feesPaid is initially 0.
     * @param amount: is the instalment the student pays
     *                whenever payment is made.
     */

    public void updateFeesPaid(int amount) {
        this.feesPaid += amount;
    }

    /**
     *
     * @return will return the date of birth of the student.
     */

    public int getYear_of_birth() {
        return super.getYear_of_birth();
    }


    public String takeCourse(Course course) {
        courses.add(course);
        int length = courses.size();
        return courses.get(length - 1).getDuration();
    }
}
