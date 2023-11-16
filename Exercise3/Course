package Exercise1;

import java.util.Objects;

public class Course {
    private String name;
    private String id;
    private int duration;
    private String teacherName;

    public Course(){}

    public Course(String name, String id, int duration, String teacherName) {
        this.name = name;
        this.id = id;
        this.duration = duration;
        this.teacherName = teacherName;
    }

    public Course(Course course){
        this.name=course.name;
        this.id=course.id;
        this.duration=course.duration;
        this.teacherName= course.teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=4){
            this.name = name;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=String.valueOf(name.charAt(0))+id+String.valueOf(teacherName.charAt(0));
        //this.id=String.valueOf(name.charAt(0))+String.valueOf(teacherName.charAt(0));

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration>=30){
            this.duration = duration;
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", duration=" + duration +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    @Override
    protected Course clone() throws CloneNotSupportedException {
        return new Course(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return duration == course.duration && Objects.equals(name, course.name) && Objects.equals(id, course.id) && Objects.equals(teacherName, course.teacherName);
    }


}
