package system.school.objects;

/**
 * This is an applicant object having the characteristics
 * of prospective students of the school. Applicant's age
 * score will determine admittance.
 */
public class Applicant extends Person{

    private int score;

    /**
     *
     * @param name
     * @param score
     * @param year_of_birth
     */

    public Applicant(String name, String gender, int score, int year_of_birth) {
        super(name, gender, year_of_birth);
        this.score = score;
    }

    /**
     *
     * @return
     */

    public int getId() {
        return super.getId();
    }

    public String getName() {
        return super.getName();
    }

    public int getScore() {
        return score;
    }

    public int getYear_of_birth() {
        return super.getYear_of_birth();
    }
}
