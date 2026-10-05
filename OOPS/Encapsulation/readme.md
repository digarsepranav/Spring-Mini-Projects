## Encapsulation

- Bundling **data + methods** that operate on that data inside a class
- Restricting direct access to internal state
- Achieved mainly using **access modifiers**
- Usually:
    - fields → `private`
    - controlled access → `public` methods

### Why?

- Data hiding
- Controlled modification
- Validation / business rules
- Protects object state
- Reduces unwanted dependencies
- Improves maintainability

### Key Idea

Object should **control its own state**.

Example:
BankAccount → balance should not be directly modified
→ deposit / withdraw control the modification

### Access Modifiers

- `private` → same class only
- default → same package
- `protected` → same package + subclasses
- `public` → everywhere

### Encapsulation ≠ Data Hiding

- Encapsulation → bundling data + behavior + controlled access
- Data hiding → restricting direct access to internal implementation/state
- Data hiding is an important part of encapsulation

### Spring Boot Connection

Encapsulation used heavily in:

- Entity classes
- DTOs
- Service classes
- Domain models

Examples:

- Entity fields → private
- Business logic → Service methods
- DTO → controlled data representation
- Internal implementation → hidden behind public API

### Interview One-Liner

> Encapsulation is the process of bundling data and the methods operating on it together while restricting direct access to the internal state and providing controlled access through methods.