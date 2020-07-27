package system.school;

import org.junit.jupiter.api.Test;

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

    Applicant chioma = new Applicant("chioma", 85, 1995);
    Student shelly = new Student("shelly", "beginner", 1996);

    @Test
    void admit() {
        assertEquals("chioma", HOD.admit(chioma));

    }

    @Test
    void expel() {
        assertEquals("chioma", HOD.expel(shelly));
    }
}