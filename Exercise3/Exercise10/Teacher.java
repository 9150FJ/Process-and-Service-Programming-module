package Exercise1.Exercise10;

import Exercise1.Course;
import Exercise1.Student;

import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends Person {
    private Course course;
    private ArrayList<Student> students;

    public Teacher() {
    }

    public Teacher(Teacher teacher) {
        super(teacher);
        this.course= teacher.course;
        this.students=teacher.students;
    }

    public Teacher(String name, String surname, String email, Course course, ArrayList<Student> students) {
        super(name, surname, email);
        this.course = course;
        this.students = students;
    }

    @Override
    public String toString() {
        return super.toString()+" Teacher{" +
                "course=" + course +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(course, teacher.course) && Objects.equals(students, teacher.students);
    }

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        return new Teacher(this);
    }
}
