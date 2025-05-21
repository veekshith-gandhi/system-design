# Java: Pass-by-Value vs Pass-by-Reference

## ❓ Common Question

> If Java passes a **copy of the reference**, isn’t that the same as pass-by-reference?

**Short Answer:**  
🔴 **No, Java is *not* pass-by-reference.**  
✅ Java is **always pass-by-value**, even for objects.

---

## 🧠 What's Really Going On?

### 🔄 True Pass-by-Reference
- The **actual variable** (like a pointer) is passed into the method.
- ✅ Reassigning inside the method **does affect** the original variable.

### 🔁 Java’s Behavior: Pass-by-Value (of Reference)
- Java passes a **copy of the reference** (not the object itself).
- ✅ You can modify the object the reference points to.
- ❌ You **cannot** change the caller's reference.

---

## 🔍 Real-World Analogy

> You give a friend a **copy of your house key** (reference):
- They can go in and **rearrange furniture** (change object properties) ✅
- If they **throw the key away and get a new house**, your house and your key stay the same ❌

If this were **true pass-by-reference**, throwing away the key would affect your copy too.

---

## 🧪 Java Example

```java
class Dog {
    String name;
}

public class PassByValueDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Max";

        System.out.println("Before: " + dog.name);
        changeDog(dog);
        System.out.println("After: " + dog.name);
    }

    static void changeDog(Dog d) {
        d.name = "Buddy";         // ✅ Modifies original object
        d = new Dog();            // ❌ Only changes local reference
        d.name = "Charlie";       // Local object only
    }
}
```
