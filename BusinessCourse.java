package ServiciosYProcesos.T2.GitHub;

import java.util.Objects;

public class BusinessCourse extends Course {
    /*
        The BusinessCourse makes its students go to an associated business
        on an internship. These Course has a duration of 30h with an
        internship that lasts for at least 15 hours
     */
    private String associatedBusiness;
    private int internship;
    public BusinessCourse(BusinessCourse source){
        super(source);
        this.internship=source.internship;
        associatedBusiness=source.associatedBusiness;
    }
    public BusinessCourse(){
        super();
    }
    public BusinessCourse(int internship, String name, String teacher, String associatedBusiness){
        super(name,teacher,30+internship);
        this.internship=internship;
        this.associatedBusiness=associatedBusiness;
    }

    @Override
    public String toString() {
        return super.toString()+"BusinessCourse{" +
                "associatedBusiness='" + associatedBusiness + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new BusinessCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessCourse that = (BusinessCourse) o;
        return Objects.equals(associatedBusiness, that.associatedBusiness);
    }

    public String getAssociatedBusiness() {
        return associatedBusiness;
    }

    public int getInternship() {
        return internship;
    }

    public void setAssociatedBusiness(String associatedBusiness) {
        this.associatedBusiness = associatedBusiness;
    }

    public void setInternship(int internship) {
        this.internship = internship;
    }
}
