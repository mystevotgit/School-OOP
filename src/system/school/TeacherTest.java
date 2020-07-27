package system.school;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    Teacher stack_lead = new Teacher("stack_lead", "chibueze",  "M", 400_000, 1991, "123") {
        @Override
        public String teach(Course scrum_fundamentals) {
            return scrum_fundamentals.getName();
        }

    };

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void create() {
        assertThat(stack_lead.create(new Course("oop", stack_lead.getName(), "6 months")), equalTo("oop"));
        assertThat(stack_lead.create(new Class("oop", "Monday", "12:00 PM","2 hours")), equalTo("oop"));
    }

    @Test
    void view() {
    }

    @Test
    void teach() {
        assertEquals("scrum fundamentals", stack_lead.teach(new Course("scrum fundamentals", stack_lead.getName(), "6 months")));
    }


//    @Test
//    void update() {
//    }
//
//    @Test
//    void delete() {
    }