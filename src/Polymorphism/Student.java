package Polymorphism;

public class Student extends User{
    private String course;

    public Student(int id, String name, String email, String password, String course) {
        super(id, name, email, password);  // Call User constructor
        this.course = course;
    }

    // Getter for course
    public String getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(String course) {
        this.course = course;
    }


}
