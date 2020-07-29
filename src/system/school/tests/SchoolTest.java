package system.school.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import system.school.objects.Class;
import system.school.objects.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {
    Principal principal = new Principal("principal", "nkem", "F", 500_000, 1980, "1234") {
        @Override
        public void view() {

        }

        @Override
        public String admit(Applicant chioma) {
            return null;
        }

    };
    List<Teacher> teachers = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Applicant> applicants = new ArrayList<>();
    School Decagon = new School("Decagon", principal);

    @BeforeEach
    void setUp() {
        System.out.println("a test commenced...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("a test was completed...");
    }

    @Test
    void getStudents() {
        assertEquals(students, Decagon.getStudents());
    }

    @Test
    void addStudent() {
        Student shelly = new Student("shelly", "F", 1992, "beginner");
        Student shelly1 = new Student("shelly1", "F",1994,"beginner");
        Student shelly2 = new Student("shelly2", "F",1996,"intermediate");
        Student shelly3 = new Student("shelly3", "F",1998,"beginner");
        Student shelly4 = new Student("shelly4", "F",1995,"expert");
        Student shelly5 = new Student("shelly5", "F",1993,"intermediate");

        assertEquals("shelly", Decagon.addStudent(shelly));
        assertEquals("shelly1", Decagon.addStudent(shelly1));
        assertEquals("shelly2", Decagon.addStudent(shelly2));
        assertEquals("shelly3", Decagon.addStudent(shelly3));
        assertEquals("shelly4", Decagon.addStudent(shelly4));
        assertEquals("shelly5", Decagon.addStudent(shelly5));
    }

    @Test
    void get() {
        assertEquals(teachers, Decagon.getTeachers());
    }


    @Test
    void getApplicants() {
        assertEquals(applicants, Decagon.getApplicants());
    }

    @Test
    void addApplicant() {
        Applicant Segun = new Applicant("Segun", "M",70, 1994);
        Applicant Chioma = new Applicant("Chioma", "F",80, 1995);
        assertThat(Decagon.addApplicant(Chioma), instanceOf(Integer.class));
        assertThat(Decagon.addApplicant(Segun), instanceOf(Integer.class));
    }

    @Test
    void getCourses() {
        assertEquals(new ArrayList<>(), Decagon.getCourses());
    }

    @Test
    void addCourse() {
        assertEquals("4 weeks", Decagon.addCourse(new Course("cs50", "david malan", "4 weeks")));
    }

    @Test
    void addCourse2() {
        assertEquals("1 week", Decagon.addCourse(new Course("scrum fundamentals", "michael", "1 week")));
    }

    @Test
    void addCourse3() {
        assertEquals("3 weeks", Decagon.addCourse(new Course("technical writing", "nkem alozie", "3 weeks")));
    }

    @Test
    void getClasses() {
        assertEquals(new ArrayList<>(), Decagon.getCourses());
    }

    @Test
    void addClass() {
        assertEquals("1 hour", Decagon.addClass(new Class("oop", "Tuesday", "9:00 AM", "1 hour")));
        assertEquals("2 hour", Decagon.addClass(new Class("technical writing", "Tuesday", "9:00 AM", "2 hour")));
        assertEquals("1 hour", Decagon.addClass(new Class("scum fundamentals", "Wednesday", "9:00 AM", "1 hour")));
    }

    @Test
    void addTeacher() {
        Teacher chibueze = new Teacher("Stack lead", "chibueze", "M", 400_000, 1991, "123") {
            @Override
            public void view() {
                System.out.println("Here are the staffs of " + Decagon.getName());
                System.out.println("Principal: " + Decagon.getPrincipal());
                System.out.println("Teachers: " + Decagon.getTeachers().toString());
                System.out.println("Students: " + Decagon.getStudents().toString());
                System.out.println("Courses: " + Decagon.getCourses().toString());
                System.out.println("Classes: " + Decagon.getClasses().toString());
            }
        };
        assertEquals("chibueze", Decagon.addTeacher(chibueze));

    }

    @Test
    void addNon_academics() {
        Non_Academic taofiq = new Non_Academic("admin", "taofiq", "F", 300_000, 1994, "123") {
            @Override
            public void view() {
                System.out.println("Principal: " + Decagon.getPrincipal().toString());
                System.out.println("Teachers: " + Decagon.getTeachers().toString());
                System.out.println("Non Academic Staffs: " + Decagon.getNon_academics().toString());
                System.out.println("Students: " + Decagon.getStudents().toString());
                System.out.println("Applicants: " + Decagon.getApplicants().toString());
                System.out.println("Courses: " + Decagon.getCourses().toString());
            }
        };
        assertEquals("taofiq", Decagon.addNon_academic(taofiq));
    }

    @Test
    void getNon_academics() {
        assertEquals(0, Decagon.getNon_Academics());
    }
}