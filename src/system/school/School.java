package system.school;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeMap.size;

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

    /**
     * This is the navigation menu of the school.
     */

    public void schoolMenu() {
//        "(Staffs, Students, Courses, Classes, Applicants, Exit)"
        System.out.println("Welcome! Select an action from the menu: (About Courses Register Login Exit)");
        return;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
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

    public void addNon_Academic(Non_Academic non_academic) {
        this.non_academics.add(non_academic);
    }

    public static List<Applicant> getApplicants() {
        return applicants;
    }

    /**
     * This method will add applicants to the applicants list.
     * @param applicant
     * @return
     */

    public int addApplicant(Applicant applicant) {
        this.applicants.add(applicant);
        int index = size(applicants);
        applicants.get(index -1).id = index;
        return index;
    }

    public static List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public static List<Class> getClasses() {
        return classes;
    }

    public void addClass(Class newClass) {
        classes.add(newClass);
    }
}
