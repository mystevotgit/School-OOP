package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.Course;
import system.school.objects.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student decadev = new Student("omolade", "F",1994,"beginner");

    @Test
    void takeCourse() {
        assertEquals("6 months", decadev.takeCourse(new Course("oop", "chibueze", "6 months")));
        assertEquals("1 week", decadev.takeCourse(new Course("scrum", "scrum teacher", "1 week")));
        assertEquals("1 week", decadev.takeCourse(new Course("personal_branding", "kimberly", "1 week")));
        assertEquals("2 weeks", decadev.takeCourse(new Course("technical_writing", "nkem alozie", "2 weeks")));
    }
}