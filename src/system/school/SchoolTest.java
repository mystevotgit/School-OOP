package system.school;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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
    void schoolMenu() {
    }

    @Test
    void getStudents() {
        assertEquals(students, Decagon.getStudents());
    }

    @Test
    void addStudent() {
    }

    @Test
    void get() {
        assertEquals(teachers, Decagon.getTeachers());
    }

    @Test
    void addStaff() {

    }

    @Test
    void getApplicants() {
        assertEquals(applicants, Decagon.getApplicants());
    }

    @Test
    void addApplicant() {
        Applicant Segun = new Applicant("Segun", 70, 1994);
        Applicant Chioma = new Applicant("Chioma", 80, 1995);
        assertThat(Decagon.addApplicant(Chioma), instanceOf(Integer.class));
        assertThat(Decagon.addApplicant(Segun), equalTo(0));
    }

    @Test
    void getCourses() {
        assertEquals(new ArrayList<>(), Decagon.getCourses());
    }

    @Test
    void addCourse() {
    }

    @Test
    void getClasses() {
        assertEquals(new ArrayList<>(), Decagon.getCourses());
    }

    @Test
    void addClass() {
    }


}