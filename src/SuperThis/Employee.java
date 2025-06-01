package SuperThis;

class Employee extends Person {
    int id;

    Employee(String name, int id) {
        super(name);  // Calls Person constructor
        this.id = id;
        System.out.println("Employee constructor called");
    }
}