package system.school.objects;

public class Class {
    private int id;
    private String course;
    private String day;
    private String start_time;
    private String duration;

    public Class(String course, String day, String start_time, String duration) {
        this.course = course;
        this.day = day;
        this.start_time = start_time;
        this.duration = duration;
    }

    public void reschedule(int id, String course, String day, String start_time, String duration) {
        this.id = id;
        this.course = course;
        this.day = day;
        this.start_time = start_time;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public String getDuration() {
        return duration;
    }

    public String getDay() {
        return day;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setId(int id) {
        this.id = id;
    }
}
