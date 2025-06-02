package Polymorphism;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    User(int id,String name,String email,String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUserDetails() {
        return "User ID: " + id +
                ", Name: " + name +
                ", Email: " + email;
        // Password is intentionally omitted for security
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
         this.password = password;
    }
}
