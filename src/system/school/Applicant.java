package system.school;

/**
 * This is an applicant object having the characteristics
 * of prospective students of the school. Applicant's age
 * score will determine admittance.
 */
public class Applicant {
    protected int id;
    private String name;
    private int score;
    private int year_of_birth;

    /**
     *
     * @param name
     * @param score
     * @param year_of_birth
     */

    public Applicant(String name, int score, int year_of_birth) {
        this.name = name;
        this.score = score;
        this.year_of_birth = year_of_birth;
    }

    /**
     *
     * @return
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }
}
