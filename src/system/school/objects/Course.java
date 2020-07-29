package system.school.objects;

public class Course {
    private String name;
    private String teacher;
    private String duration;

//    Constructor of the course class
    public Course(String name, String teachers, String duration) {
        this.name = name;
        this.teacher = teachers;
        this.duration = duration;
    }


//    Getters of the course object.
    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDuration() {
        return duration;
    }

}
