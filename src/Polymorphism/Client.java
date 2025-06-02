package Polymorphism;

public class Client {
    User user = new User(2, "Gandhi", "vee@example.com", "initial123");
    // 2) Create the utility
    UserUtility util = new UserUtility();

    // 3) Try to change with a wrong “old” password
    boolean ok1 = util.changePassword(user, "wrongPass", "newSecure456");
    // Output: Error: Old password did not match.

    // 4) Try again with the correct “old” password
    boolean ok2 = util.changePassword(user, "initial123", "newSecure456");
    // Output: Password changed successfully.

    // 5) Verify internally:
//        System.out.println("Current password is: " + user.getPassword());
}
