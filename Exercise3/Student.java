package Exercise1;

import Exercise1.Exercise10.Person;

import java.util.Objects;

public class Student extends Person {
    private Course course;

    public Student(){};
    public Student(String name, String surname, String email, Course course) {
        super(name, surname, email);
        this.course = course;
    }
    public Student(Student student){
        super(student);
        this.course =student.course;
    }

    @Override
    public String toString() {
        return super.toString()+ " Student{" +
                "curso=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return new Student(this);
    }

}
