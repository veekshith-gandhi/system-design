# `final` Keyword in Java – Complete Guide for Beginners

In Java, the `final` keyword is used to **restrict modification**. Once something is declared `final`, it **cannot be changed**.

It can be used with:

1. **Variables** – to make them constants
2. **Methods** – to prevent method overriding
3. **Classes** – to prevent inheritance

---

## 1. `final` Variables

Once assigned, the value **cannot be changed**.

```java
final int age = 25;
age = 30; // ❌ Error: Cannot assign a value to final variable 'age'
```
1. Can be local variables, instance variables, or static variables.
2. Must be initialized at the time of declaration or in the constructor.

```java
class Test {
    final int id;

    Test(int id) {
        this.id = id;  // Allowed: initialization in constructor
    }

    void show() {
        System.out.println(id);
    }
}
```
## 2. final Methods

1. Prevents subclasses from overriding the method.
```java
class Parent {
    final void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    // void display() {} ❌ Not allowed - Cannot override final method
}

```
## 3. final Classes

1. Prevents other classes from inheriting from this class.
```java
final class Bank {
    void accountInfo() {
        System.out.println("Bank details...");
    }
}

class SBI extends Bank { // ❌ Error: Cannot inherit from final class
}

```

# ✅ Summary: Pros and Cons of `final` Keyword in Java

---

## ✅ Pros of `final`

| Benefit               | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| 🔐 Immutability         | Helps define constants and secure values that shouldn't change             |
| ⚙️ Performance Optimization | JVM can optimize final methods and variables during execution            |
| ✅ Safe Design          | Prevents accidental overriding or inheritance                               |
| 📖 Improves Readability | Clearly conveys developer intent (e.g., this value/class/method won't change) |

---

## ❌ Cons of `final`

| Drawback              | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| 🚫 Reduces Flexibility | Once final, values/methods/classes can't be changed or extended             |
| ❌ Hard to Unit Test    | Final classes/methods cannot be easily mocked during testing (e.g., Mockito)|
| 📦 Limits Reusability   | Final classes can't be extended, reducing inheritance-based reuse          |

---

## 📌 Summary Table

| Use of `final`     | Effect                        |
|--------------------|-------------------------------|
| Variable           | Value cannot be reassigned    |
| Method             | Cannot be overridden          |
| Class              | Cannot be subclassed          |

