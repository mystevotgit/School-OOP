package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.Course;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

    Course SoftwareTesting = new Course("software testing", "chibueze", "3 weeks");

    @Test
    void getName() {
        assertEquals("software testing", SoftwareTesting.getName());
    }

    @Test
    void getTeacher() {
        assertEquals("chibueze", SoftwareTesting.getTeacher());
    }

    @Test
    void getDuration() {
        assertEquals("3 weeks", SoftwareTesting.getDuration());
    }

}