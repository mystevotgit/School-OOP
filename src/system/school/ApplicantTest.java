package system.school;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class ApplicantTest {
    List<Applicant> applicants = new ArrayList<>();
    Applicant Decabelle = new Applicant("Chioma",80,1995);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        assertThat(Decabelle.getId(), instanceOf(Integer.class));
    }

    @Test
    void getName() {
    }

    @Test
    void getScore() {
    }

    @Test
    void getYear_of_birth() {
    }
}