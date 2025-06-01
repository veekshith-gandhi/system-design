# 🌟 Polymorphism in Java – Explained from Scratch

## 🔷 What is Polymorphism?

**Polymorphism** means "**many forms**".  
It allows **objects to be treated as instances of their parent class**, even if they are actually instances of a subclass.

---

## ✅ Types of Polymorphism in Java

| Type                 | Also Called          | Happens At   |
|----------------------|----------------------|--------------|
| **Compile-time**     | Static Polymorphism  | Compile time |
| **Runtime**          | Dynamic Polymorphism | Runtime      |

---

## 🧪 1. Compile-time Polymorphism (Method Overloading)

### ✅ What It Is:
When **multiple methods** in the **same class** have the **same name** but different parameters.

### ✅ Example:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));           // 15
        System.out.println(calc.add(3.2, 4.1));        // 7.3
        System.out.println(calc.add(1, 2, 3));         // 6
    }
}
```
### ✅ Key Points:
1. Resolved during compilation.
2. Method signature must differ (number/type/order of parameters).

## 🧪 2. Runtime Polymorphism (Method Overriding)

### ✅ What It Is:
When a subclass provides its own version of a method that is already defined in the parent class.

### ✅ Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();  // Dog barks
        a2.sound();  // Cat meows
    }
}

```
### ✅ Key Points:
1. Resolved at runtime
2. Same method signature
3. Use @Override for clarity

### 🧠 Real-World Analogy

Imagine `Animal` is a **Remote**, and `Dog`, `Cat` are **TVs**.  
You hold a remote (`Animal a = new Dog();`) and when you press buttons (`sound()`), it behaves like the connected TV (`Dog` or `Cat`).

### 🧪 Polymorphism via Arrays / Loops
```java
class Animal {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Cow says Moo");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion roars");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Cow(), new Lion(), new Animal() };

        for (Animal a : animals) {
            a.sound();
        }
    }
}

```

### ❌ What Is NOT Polymorphism?
```java
Dog d = new Dog();  // Not 

This is direct object creation, not polymorphism.
```

### ✅ Why Use Polymorphism?
1. Code Reusability
2. Scalability
3. Maintainability
4. Supports Open/Closed Principle (SOLID)

### 🧪 Polymorphism via Interface
```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();  // Drawing Circle
        s2.draw();  // Drawing Square
    }
}

```


## ✅ Summary Table

| Type         | How                              | Example                         | Resolved When? |
|--------------|-----------------------------------|----------------------------------|----------------|
| Overloading  | Same class, different parameters  | `add(int, int)` vs `add(double)` | Compile Time   |
| Overriding   | Subclass redefines parent method  | `sound()` in `Dog` vs `Animal`  | Runtime        |
