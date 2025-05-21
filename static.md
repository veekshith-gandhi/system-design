# 🔧 `static` in Java — Explained with Examples

In Java, the `static` keyword means "**belongs to the class** rather than an instance of the class."

---



## 🧩 Where You Can Use `static`

| Element           | Description                                          |
| ----------------- | ---------------------------------------------------- |
| `static` variable | Shared variable for all objects (class variable)     |
| `static` method   | Method that can be called without creating an object |
| `static` block    | Code block that runs once when the class is loaded   |
| `static` class    | Only allowed as **nested class**                     |


---

## 📌 1. `static` Variable

```java
class Car {
    static int wheels = 4;
    String color;
}
✅ Usage: Car.wheels
🧠 Shared across all Car objects.

2. static Method
class Utils {
    static void sayHello() {
        System.out.println("Hello!");
    }
}
✅ Usage: Utils.sayHello();
⚠️ Cannot access non-static members directly.

 3. static Block
Runs once when the class is loaded into memory.

class Database {
    static {
        System.out.println("Connecting to DB...");
    }

    Database() {
        System.out.println("Database object created.");
    }
}

public class Main {
    public static void main(String[] args) {
        Database db1 = new Database();
        Database db2 = new Database();
    }
}

Connecting to DB...
Database object created.
Database object created.

🔍 Why This Happens
✅ static block executes once per class — when the class is loaded into memory by the JVM.
🌀 Then, every time you create a new object (new Database()), the constructor runs, but 
the static block does not run again.

| What happens             | How many times?                    |
| ------------------------ | ---------------------------------- |
| `static` block runs      | **Once** (when class loads)        |
| Constructor runs (`new`) | **Each time** an object is created |



## No, you cannot directly access non-static members (variables or methods) from a static method.
1. Static methods belong to the class itself, not to a specific object.
2. Non-static members belong to an instance of the class (i.e., an object).
3. So, to access non-static members, you need an object of the class.


public class Example {
    int nonStaticVar = 10;

    static void staticMethod() {
        // System.out.println(nonStaticVar); ❌ Error!
        Example obj = new Example(); // ✅ Create object
        System.out.println(obj.nonStaticVar); // ✅ Access through object
    }

    public static void main(String[] args) {
        staticMethod();
    }
}

```

```java

✅ What is a Static Block in Java?
A static block (also called a static initialization block) is used to initialize static 
variables when the class is loaded into memory.

public class Demo {
    static int x;

    // Static block
    static {
        System.out.println("Static block executed");
        x = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        System.out.println(Demo.x);
    }
}
Static block executed
Main method
100


        ✅ When is the Static Block Executed?
The static block runs once, and only when the class is loaded into memory by the JVM.
It runs before the main() method or before any static method/variable is accessed.
        
        
        ✅ What is Class Loading in Java?
Class loading is the process where the JVM loads .class files (compiled Java classes) into memory so they can be used.

The class loading has 3 main phases:
        | Phase              | Description                                                 |
        | ------------------ | ----------------------------------------------------------- |
        | **Loading**        | JVM loads the `.class` file using classloader               |
        | **Linking**        | JVM verifies, prepares, and optionally resolves classes     |
        | **Initialization** | JVM initializes static variables and executes static blocks |


       

```

### ❌ You cannot use this inside a static block in Java.

1. The keyword this refers to the current object (instance) of the class.
2. A static block runs when the class is loaded, before any object is created.
3. Since no instance exists at that point, there's no this reference available.


