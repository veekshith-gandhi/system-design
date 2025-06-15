package Constructor;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello");
        CheckConstructor first = new CheckConstructor(4,5);
        System.out.println(first);
        CheckConstructor second = new CheckConstructor(4,"veekshith");
        System.out.println(second);
    }
}
