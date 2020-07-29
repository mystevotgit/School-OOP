package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.School;
import system.school.objects.Student;
import system.school.objects.Applicant;
import system.school.objects.Principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrincipalTest {
    Principal HOD = new Principal("Principal", "Nkem", "F", 500_000, 1980, "1234") {
        @Override
        public void view() {
            System.out.println("Here are the staffs of " + Decagon.getName());
            System.out.println("Principal: " + Decagon.getPrincipal().toString());
            System.out.println("Teachers: " + Decagon.getTeachers().toString());
            System.out.println("Non Academic Staffs: " + Decagon.getNon_academics().toString());
            System.out.println("Students: " + Decagon.getStudents().toString());
            System.out.println("Applicants: " + Decagon.getApplicants().toString());
            System.out.println("Courses: " + Decagon.getCourses().toString());
            System.out.println("Classes: " + Decagon.getClasses().toString());
            return;
        }

    };

    School Decagon = new School("Decagon", HOD);

    Applicant chioma = new Applicant("chioma", "F",85, 1995);
    Applicant chioma2 = new Applicant("chioma2", "F",35, 1994);
    Applicant chioma3 = new Applicant("chioma3", "F",65, 1993);
    Applicant chioma4 = new Applicant("chioma4", "F",95, 2000);
    Applicant chioma5 = new Applicant("chioma5", "F",55, 2001);
    Applicant chioma6 = new Applicant("chioma6", "F",45, 2002);
    Applicant chioma7 = new Applicant("chioma7", "F",75, 1998);

    Student shelly = new Student("shelly", "F", 1992, "beginner");
    Student shelly1 = new Student("shelly1", "F",1994,"beginner");
    Student shelly2 = new Student("shelly2", "F",1996,"intermediate");
    Student shelly3 = new Student("shelly3", "F",1998,"beginner");
    Student shelly4 = new Student("shelly4", "F",1995,"expert");
    Student shelly5 = new Student("shelly5", "F",1993,"intermediate");
    Student shelly6 = new Student("shelly6", "F",1997,"beginner");
    Student shelly7 = new Student("shelly7", "F",1999,"intermediate");

    @Test
    void admit() {
        assertEquals("chioma", HOD.admit(chioma));
        assertEquals(null, HOD.admit(chioma2));
    }

    @Test
    void admit2() {
        assertEquals("chioma3", HOD.admit(chioma3));
        assertEquals("chioma4", HOD.admit(chioma4));
    }

    @Test
    void admit3(){
        assertEquals(null, HOD.admit(chioma5));
        assertEquals(null, HOD.admit(chioma6));
        assertEquals("chioma7", HOD.admit(chioma7));
    }

    @Test
    void expel() {
        assertEquals(true, HOD.expel(shelly));
        assertEquals(true, HOD.expel(shelly1));
        assertEquals(true, HOD.expel(shelly2));
        assertEquals(true, HOD.expel(shelly3));
        assertEquals(true, HOD.expel(shelly4));
        assertEquals(true, HOD.expel(shelly5));
        assertEquals(true, HOD.expel(shelly6));
        assertEquals(true, HOD.expel(shelly7));
    }

    @Test
    void view(){
        HOD.view();
    }

}