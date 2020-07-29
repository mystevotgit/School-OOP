package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.Non_Academic;
import system.school.objects.Principal;
import system.school.objects.School;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Non_AcademicTest {

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
    Non_Academic fredrica = new Non_Academic("finance", "fredrica", "F", 300_000,1995, "123") {
        @Override
        public void view() {

        }
    };

    @Test
    void getRole() {
        Decagon.addNon_academic(fredrica);
        assertEquals("finance", fredrica.getRole());
    }

    @Test
    void getName() {
        Decagon.addNon_academic(fredrica);
        assertEquals("fredrica", fredrica.getName());
    }

    @Test
    void getSalary() {
        Decagon.addNon_academic(fredrica);
        assertEquals(300_000, fredrica.getSalary());
    }

    @Test
    void set_and_getId() {
        Decagon.addNon_academic(fredrica);
        fredrica.setId(7);
        assertEquals(7, fredrica.getId());
        fredrica.setId(5);
        assertEquals(5, fredrica.getId());
    }

    @Test
    void getGender() {
        Decagon.addNon_academic(fredrica);
        assertEquals("F", fredrica.getGender());
    }
}