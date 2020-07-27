package system.school;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class StudentTest {
    Student decadev = new Student("omolade", "beginner", 1994);

    @Test
    void takeCourse() {
        assertThat(decadev.takeCourse(new Course("oop", "chibueze", "6 months")), instanceOf(String.class));
    }
}