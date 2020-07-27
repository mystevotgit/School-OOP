package system.school;

public class Class {
    private String course;
    private String day;
    private String start_time;
    private String duration;

    public Class(String course, String day, String start_time, String duration) {
        this.day = day;
        this.start_time = start_time;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }
}
