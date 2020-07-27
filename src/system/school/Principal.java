package system.school;

import java.util.List;

import static jdk.nashorn.internal.objects.NativeMap.size;

public abstract class Principal extends Staff implements Authorizations{

    public Principal(String role, String name, String gender, int salary, int year_of_birth, String password) {
        super(role, name, gender, salary, year_of_birth, password);
    }

    public String admit(Applicant chioma) {
        Student student = new Student(chioma.getName(), "beginner", chioma.getYear_of_birth());
        List<Student> students = School.getStudents();
        int length = size(students);
        students.add(student);
        System.out.println(students.toString());
        return students.get(length).getName();
    }

    public String expel(Student chioma) {
        List<Student> students = School.getStudents();
        students.remove(chioma);
        return "";
    }
}
