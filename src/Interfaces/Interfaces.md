# 🧠 Java Interfaces from Scratch

## 🔧 What is an Interface in Java?

An **interface** in Java is like a **contract**: it defines **what a class must do**, but not **how** it does it.

### Key Points:
- Contains **abstract methods** (no body).
- Is implemented by **classes** using `implements`.
- Can have **default and static methods** (from Java 8 onwards).
- Supports **multiple inheritance** (unlike classes).

---

## 🧱 Syntax

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound(); // Dog barks
        a2.makeSound(); // Cat meows
    }
}
```

### 🤝 Why Use Interfaces?

1. To achieve abstraction
2. To support multiple inheritance
3. To enforce a contract (e.g., all shapes must implement draw())

### 🧱 Default and Static Methods (since Java 8)

```java
interface Vehicle {
    void start();

    default void fuelType() {
        System.out.println("Uses petrol/diesel");
    }

    static void wheels() {
        System.out.println("Usually has 4 wheels");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }
}

Car c = new Car();
c.start();         // Car starts
c.fuelType();      // Uses petrol/diesel
Vehicle.wheels();  // Usually has 4 wheels


```
### 🔹 1. default Method – Used & Overridden in Class

```java
interface Animal {
    default void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog implements Animal {
    // You can use the default method as-is
}

class Cat implements Animal {
    // Or override it
    @Override
    public void sleep() {
        System.out.println("Cat curls up and sleeps");
    }
}
Dog dog = new Dog();
dog.sleep();  // Output: Animal sleeps

Cat cat = new Cat();
cat.sleep();  // Output: Cat curls up and sleeps

```

### 🔹 2. static Method – Not Inherited, Call via Interface
```java
interface Animal {
    static void info() {
        System.out.println("Animals are multicellular organisms.");
    }
}

class Dog implements Animal {
    // This doesn't inherit 'info'
    // But we can write our own static method
    static void info() {
        System.out.println("Dogs are loyal animals.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Correct usage:
        Animal.info();  // ✅ Output: Animals are multicellular organisms.

        Dog.info();     // ✅ Output: Dogs are loyal animals.

        // Wrong usage:
        Dog d = new Dog();
        // d.info();     // ❌ Error! Cannot call static method on object
    }
}

⚠ Why can't we call info() on object like d.info()?
Because:

Static methods don't belong to objects, they belong to classes or interfaces directly.

The JVM doesn’t allow object-based calling for interface static methods.
        
1. class implementing interface mus be defined
```
# ❌ Static Method ≠ Overridable

### 🔹 What is a static method in an interface?

1. A static method in an interface:
2. Has a body (implementation).
3. Belongs to the interface, not to the implementing class.
4. Cannot be overridden by the class.
5. Must be called using the interface name, not via an object.

## 🔍 Interface Methods Summary

| Feature           | Interface Static Method       | Interface Default Method       |
|------------------|-------------------------------|--------------------------------|
| Has Body?         | ✅ Yes                        | ✅ Yes                         |
| Inherited?        | ❌ No                         | ✅ Yes                         |
| Overridable?      | ❌ No                         | ✅ Yes                         |
| How to Call?      | `InterfaceName.method()`     | `object.method()`             |


# ✅ Java Interface Implementation Summary

| Concept                           | Description                                                                 |
|-----------------------------------|-----------------------------------------------------------------------------|
| Must implement all methods?       | ✅ Yes, if the class is **not abstract**.                                   |
| What if one method is missing?    | ❌ Compilation Error: Class must override all abstract methods.             |
| How to avoid the error?           | Either implement all methods **or** make the class `abstract`.             |
| Are interface variables mandatory to use? | ❌ No. You may use them if needed, but not required.               |
| Can interface variables be changed? | ❌ No. They are `public static final` by default (constants).             |
| Can you define method bodies in interface? | ✅ Only for `default` and `static` methods.                             |
| Can class override default methods? | ✅ Yes, the implementing class can override `default` methods.            |

---

## 🔁 Example

```java
interface MyInterface {
    void method1();
    void method2();
}

class MyClass implements MyInterface {
    public void method1() {
        System.out.println("Method 1 implemented");
    }

    // ❌ Error: method2() is not implemented
}



