package ServiciosYProcesos.T2.GitHub;

import java.util.ArrayList;
import java.util.Objects;

public class AdminCourse extends Course {
    /*
        The AdminCourse has a group of documents associated to manage,
        each identified with a name. The Course has a duration of 40h.
     */
    private ArrayList<String> documents;
    public AdminCourse(){
        super();
    }
    public AdminCourse(String[] documents, String name, String teacher){
        super(name,teacher,40);
        this.documents = new ArrayList<>();
        for(String s : documents){
            this.documents.add(s);
        }
    }
    public AdminCourse(AdminCourse source){
        super(source);
        this.documents = new ArrayList<>();
        for(String s : source.documents){
            this.documents.add(s);
        }
        this.documents=source.documents;
    }

    @Override
    public String toString() {
        return super.toString()+"AdminCourse{" +
                "documents=" + documents +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new AdminCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdminCourse that = (AdminCourse) o;
        return Objects.equals(documents, that.documents);
    }

    public ArrayList<String> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }
}
