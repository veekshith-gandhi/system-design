```java
✅ 1. What is Inheritance?
Inheritance allows a class (subclass/child) to acquire the properties and behaviors 
(fields and methods) of another class (superclass/parent).

| Type             | Supported in Java?                    | Example                   |
| ---------------- | ------------------------------------- | ------------------------- |
| **Single**       | ✅ Yes                                 | One class extends another |
| **Multilevel**   | ✅ Yes                                 | A → B → C                 |
| **Hierarchical** | ✅ Yes                                 | One parent, many children |
| **Multiple**     | ❌ No (with classes), ✅ via interfaces |                           |


🧠 Java does NOT support multiple inheritance with classes (to avoid ambiguity like the diamond problem), but it supports
it using interfaces.

✅ 3. extends Keyword
Used to derive a class from another class.
class Car { }
class ElectricCar extends Car { } // Car is parent

✅ 4. Method Overriding
Child class provides a specific implementation of a method already defined in the parent.
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

✅ 5. super Keyword
Used to refer to the parent class
Can be used to:
Call parent class constructor: super();
Call parent method: super.methodName();

class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void greet() {
        super.greet(); // calls parent version
        System.out.println("Hello from Child");
    }
}

✅ 6. Constructors in Inheritance
Parent class constructor is always called first, either implicitly or using super().
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}
class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

✅ 7. final and Inheritance
final class: Cannot be extended.
final method: Cannot be overridden.
        
final class Vehicle { } // Cannot be subclassed
class Animal {
    final void breathe() { } // Cannot be overridden
}

        | Modifier    |  (same package)? | different package)? | 
        | ----------- | --------------   | ---------- |
        | `public`    | ✅ Yes           | ✅ Yes        |
        | `protected` | ✅ Yes            | ✅ Yes        |
        | `default`   | ✅ Yes             | ❌ No          |
        | `private`   | ❌ No             | ❌ No         |

 ✅ 9. Upcasting and Downcasting
Upcasting: Child → Parent (implicit)
Downcasting: Parent → Child (explicit, and risky)

Animal a = new Dog();       // Upcasting ✅
Dog d = (Dog) a;            // Downcasting ✅ but needs caution

✅ 10. Inheritance with Interfaces
Java supports multiple inheritance via interfaces.

interface A {
    void show();
}

interface B {
    void display();
}

class MyClass implements A, B {
    public void show() { }
    public void display() { }
}


✅ 11. Object Class
Every class in Java implicitly extends java.lang.Object.

class MyClass {
    // Inherits toString(), equals(), hashCode() etc. from Object
}


✅ 12. Abstract Classes and Inheritance
You can’t instantiate abstract classes, but you can inherit from them and override abstract methods.

abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}


 1. whenever you create a object of a class first parent constructor is execeuted 
 2. we do not extend constructor
 3. super must be written in first line
 4. this must be written in first line       

```