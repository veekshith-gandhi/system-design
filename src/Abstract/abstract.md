# 🧠 Understanding Abstract in Java

## What is "Abstract" in Java?

In the real world, **abstract** means something *not fully defined*—just an idea or blueprint.

In **Java**, `abstract` is used to define a **base template** for classes and methods. You can't use it directly, but it tells other classes:  
*"Here's what you MUST implement."*

---

## 🧱 Key Concepts

### 1. Abstract Class

An abstract class:
- Cannot be instantiated (you can't create objects from it directly).
- Can contain:
    - Abstract methods (no body)
    - Concrete methods (fully defined)
    - Variables, constructors, etc.

```java
abstract class Animal {
    abstract void sound();      // Abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

```

### 2. Abstract Method
A method that is declared without implementation:
- Must be implemented in the child class.

```java
abstract void sound();
```

### 3. Why use Abstract Classes?

- You want to create a common template.
- You want to enforce rules on child classes (force them to implement specific methods).


# Abstract Classes Implementing Interfaces in Java

## 🤔 What’s the Situation?

- You have an **interface** with method declarations.
- A class **implements** the interface.
- But if that class is **abstract**, you don’t have to override all the methods from the interface immediately.

Let’s understand **why** this works and **how** it plays out.

---

## 🔸 What is an Interface?

An interface is like a **contract** that says:

> Any class that *implements* me must provide code for all my methods.

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    // ❌ Compiler error if makeSound() is not implemented
}

abstract class Dog implements Animal {
    // ✅ No compiler error even if makeSound() is not implemented
}


```

## ✅ Why Abstract Classes Can Skip Method Implementation

- An abstract class is a class that is not complete. It acts like a blueprint and cannot be instantiated directly.
- By marking the class as abstract, you're telling the compiler:
- I know I haven’t implemented everything yet. I expect subclasses to complete it.
- Therefore, Java does not force you to implement all interface methods in an abstract class.

## 📌 Key Points

1. Interfaces = 100% abstract by default.
2. Abstract classes can skip implementing interface methods.
3. Concrete classes must provide implementations.

