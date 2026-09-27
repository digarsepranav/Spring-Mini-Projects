# Java OOP — Day 1 Notes

## 1. What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm where code is organized around objects.

An object contains:

- State → data/attributes
- Behavior → methods/operations

Example:

class Student {
    String name;
    int age;

    void study() {
        System.out.println(name + " is studying");
    }
}

Here:
- name, age → State
- study() → Behavior


## 2. Class vs Object

### Class

A class is a blueprint/template that defines the structure and behavior of objects.

class Student {
    String name;
    int age;

    void study() {
        System.out.println("Studying");
    }
}

### Object

An object is a runtime instance of a class.

Student s1 = new Student();

Here:
- Student → class
- s1 → reference variable
- new Student() → creates an object

Mental model:

Class → Blueprint
Object → Actual runtime instance


## 3. What Happens When `new` Is Used?

Consider:

Student s1 = new Student();

Conceptually:

1. Memory is allocated for the new object.
2. Instance fields receive default values.
3. Constructor executes.
4. The reference to the object is assigned to s1.

Mental model:

new
 ↓
Object created
 ↓
Constructor executes
 ↓
Reference assigned


## 4. Constructor

A constructor initializes an object when it is created.

Example:

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

Usage:

Student s = new Student("Pranav");

Important:

`new` creates/allocates the object.
The constructor initializes the object.

Do not think that the constructor itself creates the object.


## 5. Default Constructor

If you don't define any constructor:

class Student {
    String name;
}

Java provides a default no-argument constructor.

Therefore:

Student s = new Student();

works.

However, if you define your own constructor:

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

Java no longer automatically provides:

Student()

Therefore:

new Student("Pranav");  // Valid
new Student();          // Compilation error


## 6. Constructor Overloading

A class can have multiple constructors with different parameter lists.

class Student {

    String name;
    int age;

    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

This is called constructor overloading.


## 7. `this` Keyword

`this` refers to the current object.

Most commonly, it is used when a constructor parameter has the same name as an instance variable.

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

Here:

this.name → instance variable
name      → constructor parameter

Therefore:

this.name = name;

means:

"Store the parameter value in the current object's name field."

Without `this`:

name = name;

the parameter is effectively assigned to itself.


## 8. Reference Variable vs Object

Consider:

Student s1 = new Student("A");

`s1` is NOT the object itself.

`s1` is a reference variable that points to the object.

Mental model:

s1 ───────> Student object


## 9. Multiple References to One Object

Consider:

Student s1 = new Student("A");
Student s2 = s1;

Only ONE object exists.

Both references point to the same object.

s1 ──────┐
         ↓
      Student
      name = "A"
         ↑
s2 ──────┘

Therefore:

s2.name = "B";

System.out.println(s1.name);

Output:

B

Because s1 and s2 refer to the same object.


### Compare

Two objects:

Student s1 = new Student();
Student s2 = new Student();

One object, two references:

Student s1 = new Student();
Student s2 = s1;


## 10. Instance Variables

An instance variable belongs to an object.

class Student {
    String name;
}

Each object gets its own copy.

Student s1 = new Student();
Student s2 = new Student();

s1.name = "A";
s2.name = "B";

Conceptually:

s1 → name = "A"
s2 → name = "B"

Each object maintains its own state.

Mental model:

Instance → belongs to object


## 11. Static Variables

A static variable belongs to the class rather than individual objects.

class Student {
    static String college = "RGPV";
}

There is one shared copy.

Student s1 = new Student();
Student s2 = new Student();

Student.college = "IIT";

Both objects observe:

IIT

Mental model:

Instance → belongs to object
Static   → belongs to class

Important:

Static does NOT mean objects cannot be created.

A class can contain both:
- instance variables
- static variables


## 12. Access Modifiers

Java provides access control using:

private
default
protected
public

The important OOP idea is that access modifiers control who can access or modify data.

Example:

class BankAccount {

    private double balance;
}

Outside code cannot directly do:

account.balance = -5000;

because balance is private.


## 13. Encapsulation

Encapsulation means:

Protecting an object's internal state and controlling how that state can be accessed or modified.

Example:

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }
}

The outside world cannot directly modify:

balance

Instead, it interacts through controlled operations:

deposit()
withdraw()
getBalance()


## 14. Encapsulation Is NOT Just Getters and Setters

A common misconception is:

"Encapsulation means private fields + getters/setters."

That is incomplete.

The deeper principle is:

"The object should control its own valid state."

For example:

public void setBalance(double balance) {
    this.balance = balance;
}

allows:

account.setBalance(-100000);

This can create an invalid BankAccount state.

Instead, provide meaningful operations:

deposit()
withdraw()

These methods can enforce business rules.

Important principle:

Expose only the operations that allow the object to remain in a valid state.


## 15. State vs Behavior

An object has two important aspects:

### State

Data representing the current condition of the object.

For BankAccount:

accountNumber
holderName
balance

### Behavior

Operations the object can perform.

deposit()
withdraw()
getBalance()

Mental model:

BankAccount

State:
    accountNumber
    holderName
    balance

Behavior:
    deposit()
    withdraw()
    getBalance()


## 16. BankAccount Example

class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(
            String accountNumber,
            String holderName,
            double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}

This demonstrates:

- Class
- Object
- Constructor
- this
- Instance variables
- private fields
- Encapsulation
- Getters
- Object state
- Object behavior


## 17. Important Mental Models

### Class vs Object

Class  → Definition / Blueprint
Object → Runtime instance

### Reference vs Object

Reference → Points to an object
Object    → Actual runtime entity

### Constructor

new         → Creates/allocates object
constructor → Initializes object

### Instance vs Static

Instance → Belongs to object
Static   → Belongs to class

### Encapsulation

Protect state
+
Control how state changes
=
Encapsulation


## 18. Important Interview Questions

You should be able to answer these without memorizing definitions:

1. What is a class?
2. What is an object?
3. What happens when `new` is used?
4. What is a constructor?
5. Does a constructor create an object?
6. When does Java provide a default constructor?
7. What happens when you define your own constructor?
8. Why do we use `this`?
9. What is the difference between an object and a reference?
10. What happens when two references point to the same object?
11. What is an instance variable?
12. What is a static variable?
13. Instance variable vs static variable?
14. What are access modifiers?
15. What is encapsulation?
16. Why should fields generally be private?
17. Why isn't encapsulation simply getters and setters?
18. Why might `setBalance()` be a bad design for a BankAccount?
19. What is the difference between state and behavior?
20. Why should an object control its own state?


# Day 1 Core Takeaway

The most important mental model:

Class
  ↓
Defines state + behavior

Object
  ↓
Runtime instance of class

Reference
  ↓
Points to object

Constructor
  ↓
Initializes object

this
  ↓
Refers to current object

Instance
  ↓
Belongs to object

static
  ↓
Belongs to class

Encapsulation
  ↓
Protect state + control how it changes


# Interview-Level Principle

Don't just memorize:

"Encapsulation means data hiding."

Understand:

"An object should manage its own state and expose controlled operations rather than allowing arbitrary external modification."