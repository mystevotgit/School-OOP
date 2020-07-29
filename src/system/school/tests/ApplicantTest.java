package system.school.tests;

import org.junit.jupiter.api.Test;
import system.school.objects.Applicant;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

class ApplicantTest {
    List<Applicant> applicants = new ArrayList<>();
    Applicant Decabelle = new Applicant("Chioma","F",80,1995);

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