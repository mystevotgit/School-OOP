package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.Class;
import system.school.objects.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TeacherTest {
    Principal HOD;
    Teacher stack_lead = new Teacher("stack_lead", "chibueze", "M", 400_000, 1991, "123") {

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
    School Decagon = new School("Decagon", HOD);

    @Test
    void teach() {
        assertThat(stack_lead.teach(new Class("oop", "Tuesday", "9:00 AM", "1 hour")), equalTo("1 hour"));
        assertThat(stack_lead.teach(new Class("oop", "Monday", "12:00 PM", "2 hours")), equalTo("2 hours"));
        assertEquals("2 weeks", stack_lead.teach(new Course("scrum fundamentals", stack_lead.getName(), "2 weeks")));
        assertEquals("3 weeks", stack_lead.teach(new Course("unit testing", stack_lead.getName(), "3 weeks")));
    }

    @Test
    void view() {
        stack_lead.view();
    }

    @Test
    void getDate_of_birth() {
        assertEquals(1991, stack_lead.getDate_of_birth());
    }
}