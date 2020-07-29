package system.school.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a school object having the characteristics
 * of a school.
 * It contain list of teachers, students, courses, classes and applicants.
 * it contain the principal too. This demonstrates composition.
 */
public class School {
    private static String name;
    private static Principal principal;
    private static List<Non_Academic> non_academics;
    private static List<Teacher> teachers;
    private static List<Student> students;
    private static List<Course> courses;
    private static List<Class> classes;
    private static List<Applicant> applicants;

    /**
     * This method creates a new school object.
     * it is the constructor of the school class.
     * @param name
     * @param principal
     */
    public School(String name, Principal principal) {
        this.name = name;
        this.principal = principal;
        this.teachers = new ArrayList<>();
        this.non_academics = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.applicants = new ArrayList<>();
    }


    //  The following methods are getters and setters for the fields in the school class.

    public static String getName() {
        return name;
    }

    public static Principal getPrincipal() {
        return principal;
    }

    public static List<Non_Academic> getNon_academics() {
        return non_academics;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public int getNon_Academics() {
        for (int i = 0; i < non_academics.size(); i++) {
            System.out.println(i + 1 + non_academics.get(i).getName());
        }
        return non_academics.size();
    }

    public static List<Applicant> getApplicants() {
        return applicants;
    }

    public static List<Class> getClasses() {
        return classes;
    }
    public static List<Course> getCourses() {
        return courses;
    }



    /**
     * This method will add applicants to the applicant's list.
     * @param applicant
     * @return
     */

    public static int addApplicant(Applicant applicant) {
        applicants.add(applicant);
        int index = applicants.size();
        applicants.get(index -1).setId(index);
        return index;
    }

    /**
     * This method will add non academic staff to the non academic staff's list.
     * @param non_academic
     * @return
     */

    public String addNon_academic(Non_Academic non_academic) {
        this.non_academics.add(non_academic);
        int index = non_academics.size();
        non_academics.get(index - 1).setId(index);
        return non_academics.get(index - 1).getName();
    }

    /**
     * This method will add teacher to the teacher's list.
     * @param teacher
     * @return
     */

    public String addTeacher(Teacher teacher) {
        teachers.add(teacher);
        int index = teachers.size();
        teachers.get(index - 1).setId(index);
        return teachers.get(index - 1).getName();
    }

    /**
     * This method will add student to the student's list.
     * @param student
     * @return
     */

    public String addStudent(Student student) {
        int length = students.size();
        this.students.add(student);
        return students.get(length).getName();
    }

    /**
     * This method will add course to the course list.
     * @param course
     * @return
     */

    public String addCourse(Course course) {
        int length = classes.size();
        courses.add(course);
        return courses.get(length).getDuration();
    }

    /**
     * This method will add class to the class list.
     * @param newClass
     * @return
     */

    public String addClass(Class newClass) {
        int length = classes.size();
        newClass.setId(length);
        classes.add(newClass);
        return classes.get(length).getDuration();
    }
}
