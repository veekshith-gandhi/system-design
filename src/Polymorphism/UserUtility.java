package Polymorphism;

public class UserUtility {
    public boolean changePassword(User user, String oldPassword, String newPassword) {
        if (user.getPassword().equals(oldPassword)) {
            user.setPassword(newPassword);
            System.out.println("Password changed successfully.");
            return true;
        } else {
            System.out.println("Error: Old password did not match.");
            return false;
        }
    }
}
