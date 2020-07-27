package system.school;

import java.util.List;

/**
 * This is a student object having the characteristics
 * of students of the school.
 */

public class Student {
    private int id;
    private String name;
    private String level;
    private int year_of_birth;
    private int feesPaid = 0;
    private final int feesTotal = 3_000_000;
    private List<Course> courses;

    /**
     * @param name
     * @param level
     * @param year_of_birth
     */
    public Student(String name, String level, int year_of_birth) {

    }


    /**
     *
     * @return will return the student's id.
     */
    public int getId() {
        return id;
    }

    /**
     * This method will create the student's id.
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     *
     * @return will return the student's name.
     */
    public String getName() {
        return name;
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
        return year_of_birth;
    }
    /**
     * This method will create the student's date of birth.
     * @param
     */
    public void setDate_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String takeCourse(Course course) {
        courses.add(course);
        return course.getName();
    }
}
