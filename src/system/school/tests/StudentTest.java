package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.Course;
import system.school.objects.Principal;
import system.school.objects.School;
import system.school.objects.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
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
    Student decadev = new Student("omolade", "F",1994,"beginner");

    @Test
    void takeCourse() {
        assertEquals("6 months", decadev.takeCourse(new Course("oop", "chibueze", "6 months")));
        assertEquals("1 week", decadev.takeCourse(new Course("scrum", "scrum teacher", "1 week")));
        assertEquals("1 week", decadev.takeCourse(new Course("personal_branding", "kimberly", "1 week")));
        assertEquals("2 weeks", decadev.takeCourse(new Course("technical_writing", "nkem alozie", "2 weeks")));
    }

    @Test
    void setId() {
        Decagon.addStudent(decadev);
        decadev.setId(1);
        assertEquals(1, decadev.getId());
    }

    @Test
    void getId() {
        Decagon.addStudent(decadev);
        decadev.setId(7);
        assertEquals(7, decadev.getId());
    }

    @Test
    void getName() {
        Decagon.addStudent(decadev);
        assertEquals("omolade", decadev.getName());
    }

    @Test
    void getFeesPaid() {
        Decagon.addStudent(decadev);
        assertEquals(0, decadev.getFeesPaid());
        decadev.updateFeesPaid(330_000);
        assertEquals(330_000, decadev.getFeesPaid());
    }

    @Test
    void updateFeesPaid() {
        Decagon.addStudent(decadev);
        decadev.updateFeesPaid(100_000);
        assertEquals(100_000, decadev.getFeesPaid());
        decadev.updateFeesPaid(100_000);
        assertEquals(200_000, decadev.getFeesPaid());
        decadev.updateFeesPaid(300_000);
        assertEquals(500_000, decadev.getFeesPaid());
    }

    @Test
    void update_and_get_Level(){
        Decagon.addStudent(decadev);
        assertEquals("beginner", decadev.getLevel());
        decadev.updateLevel("intermediate");
        assertEquals("intermediate", decadev.getLevel());
    }
}