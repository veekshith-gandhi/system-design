
# 🔧 Java Constructors - Complete Guide

## 🔷 What is a Constructor?

A **constructor** is a special method that is automatically called when you **create an object** of a class.

---

## 🔹 Key Characteristics

| Feature                     | Description                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
| Name                       | Same as the class name                                                      |
| Return Type                | **No return type**, not even `void`                                        |
| Called When                | Object is created using `new` keyword                                       |
| Purpose                    | Initialize object state (assign values to fields)                           |
| Can Be Overloaded          | Yes – you can define multiple constructors with different parameters        |

---

## 🔹 Types of Constructors

### 1. Default Constructor
If **you don’t define any constructor**, Java provides a default one.

```java
class Example {
    Example() {
        System.out.println("Default constructor called");
    }
}
```

**Usage:**
```java
Example e = new Example(); // calls default constructor
```

---

### 2. Parameterized Constructor

Used to **pass values** when creating an object.

```java
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}
```

**Usage:**
```java
Person p = new Person("Alice", 25);
```

---

### 3. Constructor Overloading

Multiple constructors with **different parameter lists**.

```java
class Car {
    String model;
    int year;

    Car(String m) {
        model = m;
    }

    Car(String m, int y) {
        model = m;
        year = y;
    }
}
```

---

### 4. Copy Constructor

Java doesn't have built-in copy constructors like C++, but you can define one manually.

```java
class Box {
    int length;

    Box(int l) {
        length = l;
    }

    // Copy constructor
    Box(Box b) {
        length = b.length;
    }
}
```

---

## 🔹 Using `this` Keyword

Used to refer to **current object** inside the class.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name; // distinguish between field and parameter
    }
}
```

---

## 🔹 Calling One Constructor from Another (`this()`)

```java
class Laptop {
    String brand;
    int ram;

    Laptop(String brand) {
        this(brand, 8);  // Calls second constructor
    }

    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
}
```

---

## 🔹 Constructor vs Method

| Feature       | Constructor                          | Method                                 |
|---------------|--------------------------------------|----------------------------------------|
| Name          | Same as class                        | Can be anything                        |
| Return Type   | None (not even `void`)               | Must have a return type                |
| Call          | Automatically when object is created | Manually called                        |
| Purpose       | Initialize object                    | Perform an action or operation         |

---

## 🔹 Constructor in Inheritance

Use `super(...)` to call the **parent constructor**.

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal()
        System.out.println("Dog constructor");
    }
}
```

---

## 🔹 Important Rules

- You **can’t call a constructor directly** like a method.
- You **must not return anything** from a constructor.
- If **no constructor is defined**, Java provides a default no-argument constructor.
- If you define **any constructor**, Java does **not** create the default one.
- `this()` and `super()` must be the **first statement** in a constructor if used.

---

## 🔹 Common Errors

| Mistake                           | Error Message / Result                                    |
|----------------------------------|-----------------------------------------------------------|
| Giving return type to constructor| Treated as a method, not a constructor                    |
| Forgetting `super()` in subclass | Won't compile if parent has parameterized constructor     |
| Using `this()` after statements  | Compile error – must be first line in constructor         |

---

## 🔹 Real-life Analogy

> 📱 When you buy a new phone (object), the constructor is like the **initial setup screen** that sets your language, Wi-Fi, etc.  
> It runs **only once**, automatically.

---

## ✅ Example: Putting It All Together

```java
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}
```

---