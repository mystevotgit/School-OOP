package system.school.objects;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private String duration;
    private List<Class> classes = new ArrayList<>();

    public Course(String name, String teachers, String duration) {
        this.name = name;
        this.teacher = teachers;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDuration() {
        return duration;
    }

    public String addClass(Class aClass) {
        int length = classes.size();
        classes.add(aClass);
        classes.get(length - 1);
        return "";
    }
}
