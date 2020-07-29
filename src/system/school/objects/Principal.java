package system.school.objects;

import java.util.Calendar;
import java.util.List;

//    The Principal class inherits the staff object (inheritance).
//    The Principal class implements the authorization interface (Abstraction).
public abstract class Principal extends Staff implements Authorizations {

//    Constructor of the Principal Class
    public Principal(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }


    /**
     * This method allows the principal to admit a student from the applicant list.
     * The admission is based on age and score.
     * @param chioma
     * @return
     */

    public String admit(Applicant chioma) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age = year - chioma.getYear_of_birth();
        String gender = chioma.getGender();
        List<Student> students = School.getStudents();
        int length = students.size();
        int score = chioma.getScore();
        if (age > 19 && score > 50) {
            String level = (score < 61) ? "beginner" : ((score > 85) ? "advance" : "intermediate");
            Student student = new Student(chioma.getName(), gender, chioma.getYear_of_birth(), level);
            student.setId(length);
            students.add(student);
            return chioma.getName();
        }
        return null;
    }

    /**
     * This method allows the principal to expel a student.
     * @param shelly
     * @return
     */

    public Boolean expel(Student shelly) {
        List<Student> students = School.getStudents();
        students.remove(shelly);
        if (!students.contains(shelly)) {
            return true;
        } else {
            return false;
        }
    }
}
