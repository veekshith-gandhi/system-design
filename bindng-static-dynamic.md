# 🔗 Java Binding: Static vs Dynamic

## 🧠 What is "Binding"?

**Binding** is the process of connecting a method call to its actual method definition (body).  
Java uses two types of binding:

| Type             | Also Known As           | Happens When?                |
|------------------|-------------------------|------------------------------|
| **Static Binding** | Early Binding / Compile-Time | During compilation           |
| **Dynamic Binding** | Late Binding / Runtime     | During program execution     |

---

## ✅ Static Binding (Early Binding)

### 📌 Key Points:
- Happens at **compile time**
- Used for: `final`, `static`, `private` methods and constructors
- Compiler knows the exact method to call

### 📦 Example:

```java
class Animal {
    static void sound() {
        System.out.println("Animal makes sound");
    }
    
    void walk() {
        System.out.println("Animal walks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();  // Static Binding
        a.walk();   // Static Binding (type is known at compile time)
    }
}

sound() is a static method → resolved at compile time
walk() is not overridden → resolved by the type of reference

```
## 🔄 Dynamic Binding (Late Binding)

### 📌 Key Points:

- Happens at runtime
- Works with overridden non-static, non-final, and non-private methods
- Enables runtime polymorphism

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Reference type is Animal, object is Dog
        a.sound();             // Dynamic Binding
    }
}


- At compile time, a is Animal 
- At runtime, a is pointing to a Dog → Dog's sound() is called

```