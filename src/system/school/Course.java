package system.school;

public class Course {
    private String name;
    private String teacher;
    private String duration;

    public Course(String name, String teachers, String duration) {
        this.name = name;
        this.teacher = teachers;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }
}
