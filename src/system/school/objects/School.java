package system.school.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a school object having the characteristics
 * of a school.
 * It implement Teachers and Students using an ArrayList.
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

    public static String getName() {
        return name;
    }

    public static Principal getPrincipal() {
        return principal;
    }

    public static List<Non_Academic> getNon_academics() {
        return non_academics;
    }

    public String addNon_academic(Non_Academic non_academic) {
        this.non_academics.add(non_academic);
        return non_academic.getName();
    }

    public static List<Student> getStudents() {
        return students;
    }

    public String addStudent(Student student) {
        int length = students.size();
        this.students.add(student);
        return students.get(length).getName();
    }

    public static List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    public List<Non_Academic> getNon_Academics() {
        return non_academics;
    }

    public static List<Applicant> getApplicants() {
        return applicants;
    }

    /**
     * This method will add applicants to the applicants list.
     * @param applicant
     * @return
     */

    public static int addApplicant(Applicant applicant) {
        applicants.add(applicant);
        int index = applicants.size();
        applicants.get(index -1).setId(index);
        return index;
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public String addCourse(Course course) {
        int length = classes.size();
        courses.add(course);
        return courses.get(length).getDuration();
    }

    public static List<Class> getClasses() {
        return classes;
    }

    public String addClass(Class newClass) {
        int length = classes.size();
        newClass.setId(length);
        classes.add(newClass);
        return classes.get(length).getDuration();
    }
}
