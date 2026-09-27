# Polymorphism in Java

## What is Polymorphism?

**Polymorphism** means **"One interface/reference, multiple forms."**

It allows the same method or interface to behave differently depending on the **object or context**.

Java mainly supports two types of polymorphism:

1. **Compile-Time Polymorphism**
2. **Runtime Polymorphism**

---

## 1. Compile-Time Polymorphism

Also called **Static Polymorphism**.

Achieved through **Method Overloading**.

### Method Overloading

Same method name but **different parameters**.

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

### Key Points

- Decision is made at **compile time**
- Achieved using **method overloading**
- Parameters must be different
- Return type alone cannot differentiate overloaded methods

---

## 2. Runtime Polymorphism

Also called **Dynamic Polymorphism**.

Achieved through **Method Overriding**.

A parent reference can refer to a child object.

```java
class Payment {
    void pay() {
        System.out.println("Payment");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay() {
        System.out.println("UPI Payment");
    }
}

class CardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Card Payment");
    }
}
```

```java
Payment p1 = new UPIPayment();
Payment p2 = new CardPayment();

p1.pay(); // UPI Payment
p2.pay(); // Card Payment
```

Here:

```text
Payment reference
       |
       v
    pay()
       |
   Runtime decides
    /          \
UPIPayment   CardPayment
   |              |
UPI Payment   Card Payment
```

This is called **Dynamic Method Dispatch**.

### Key Points

- Decision is made at **runtime**
- Achieved through **method overriding**
- Requires inheritance
- Parent reference can hold a child object
- The **actual object type** determines which overridden method executes

---

## Overloading vs Overriding

| Feature | Overloading | Overriding |
|---|---|---|
| Polymorphism | Compile-time | Runtime |
| Method | Same name | Same signature |
| Parameters | Must differ | Same |
| Inheritance | Not required | Required |
| Decision | Compile time | Runtime |
| Main concept | Method Overloading | Method Overriding |

---

## Important Interview Example

```java
Payment payment = new UPIPayment();
payment.pay();
```

Here:

- Reference type = `Payment`
- Object type = `UPIPayment`
- `pay()` is overridden
- Therefore `UPIPayment.pay()` executes

**Rule:**

> For overridden instance methods, Java uses the **actual object type**, not the reference type, to decide which method executes.

---

## Why Polymorphism?

Polymorphism provides:

- **Loose Coupling**
- **Code Reusability**
- **Flexibility**
- **Extensibility**
- Ability to work with multiple implementations through a common parent/interface

Example:

```java
void processPayment(Payment payment) {
    payment.pay();
}
```

The same method can handle:

```java
processPayment(new UPIPayment());
processPayment(new CardPayment());
```

No change to `processPayment()` is required.

---

## Interview One-Liner

> **Polymorphism is the ability of the same interface or method call to exhibit different behavior depending on the object or context.**

### Remember

```text
Overloading  → Compile Time → Different Parameters
Overriding   → Runtime      → Same Method Signature
```