# Classes & Objects — Java OOP

## 1. Class

- **Blueprint / template** for creating objects
- Defines:
    - **State** → fields / variables
    - **Behavior** → methods
- User-defined **reference type**
- Class itself ≠ actual object

## 2. Object

- **Runtime instance** of a class
- Has:
    - **Identity** → unique object
    - **State** → current field values
    - **Behavior** → methods
- Objects generally stored in **Heap**
- Reference variable points to the object

## 3. Instance Variables

- Variables belonging to an **object**
- Every separately created object gets its **own copy**
- Each object maintains **independent state**
- Changing one object → doesn't affect another object

## 4. Reference Variable

- Stores a **reference/address-like value** pointing to an object
- Does not contain the complete object itself
- Multiple references can point to the **same object**

## 5. `s2 = s1`

- Does **NOT** create a new object
- `s1` and `s2` → point to the **same object**
- Modification through `s2` → visible through `s1`
- Important:

| Operation | Result |
|---|---|
| `new Student()` | New object |
| `s2 = s1` | Same object/reference |

### Memory Concept

```text
s1 ─────┐
        ├──→ Student Object
s2 ─────┘
```

## 6. Object Identity

- Two different objects can have identical data
- Still → **different objects**
- Same reference → **same object**
- `==` with objects → compares **reference identity**
- `.equals()` → can compare **logical/content equality** if properly implemented

## 7. Java Memory

- Objects → generally **Heap**
- Local reference variables → **Stack frame**
- Reference → points to Heap object
- **Garbage Collector** → removes unreachable objects

## 8. Java Pass-by-Value

- Java is **always pass-by-value**
- For objects → value being copied = **reference value**
- Therefore multiple references can point to the same object
- Java is **NOT pass-by-reference**

## 9. Spring Boot Connection

Spring Boot heavily uses classes + objects.

Common Spring classes:

- `@Component`
- `@Service`
- `@Repository`
- `@Controller`
- `@RestController`
- `@Entity`
- DTO classes

### Spring Bean

- Spring creates and manages objects → **Beans**
- Default scope → **Singleton**
- One bean instance per Spring container
- Multiple references/injections → normally refer to same bean
- Shared mutable state in singleton beans → potential **thread-safety issue**

### Concepts built on this

- Dependency Injection
- IoC Container
- Bean lifecycle
- Bean scopes
- Singleton vs Prototype
- Object state
- Thread safety

## Interview One-Liner

> **Class = blueprint, Object = runtime instance. Each separately created object has independent state, while multiple references can point to the same object.**