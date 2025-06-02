package Polymorphism;

public class Instructor extends User {
    private String subject;

    // No-arg constructor (you already have this)
    public Instructor() {
        super(0, "Default", "default@email.com", "password");
    }

    // Optional: Constructor with subject and user details
    public Instructor(int id, String name, String email, String password, String subject) {
        super(id, name, email, password);
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Optional: Override getUserDetails
    @Override
    public String getUserDetails() {
        return super.getUserDetails() + ", Subject: " + subject;
    }
}
