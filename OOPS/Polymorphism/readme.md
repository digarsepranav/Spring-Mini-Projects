- Type
    - Order
- Return type alone → cannot overload

### 2. Runtime Polymorphism

- Achieved through **method overriding**
- Requires inheritance / interface implementation
- Same method signature
- Child provides its own implementation
- Method selection → runtime
- Also called **Dynamic Method Dispatch**

---

## Reference Type vs Actual Object

When:

```java
Parent ref = new Child();

- Parent → reference type
- Child → actual object type
Reference Type Decides
- What members are accessible
- Checked at compile time
Actual Object Decides
- Which overridden instance method executes
- Decided at runtime
Golden Rule
Access → Reference Type
Overridden Method → Actual Object

Upcasting
Child → Parent

- Child object referenced by parent type
- Usually implicit
- Safe
- Child is-a Parent
- Main basis of runtime polymorphism
Downcasting
Parent → Child

- Explicit cast required
- Valid only when actual object is that child type
- Wrong cast → ClassCastException
- instanceof → safe type checking before casting
Runtime Polymorphism
Concept:
Animal
 ├── Dog
 └── Cat

- Animal reference can refer to Dog
- Same reference can refer to Cat
- Same overridden method call → different behavior
- Dog object → Dog implementation
- Cat object → Cat implementation
Polymorphism Through Collections
- Parent/interface type can hold different child objects
- Same loop/method can process all objects
- Each object executes its own overridden behavior
Animal[]
 ├── Dog
 ├── Cat
 └── Dog

Method Polymorphism
A method can accept a parent/interface type.
- Same method
- Different child objects
- Different overridden behavior
- Makes code generic and extensible
Method Overloading
- Same method name
- Different parameter list
- Compile-time decision
- Inheritance not required
Valid differences
- Number of parameters
- Parameter types
- Parameter order
Not enough
- Different return type only
- Different access modifier only
Method Overriding
- Parent-child relationship
- Same method signature
- Child provides new implementation
- Runtime method dispatch
- @Override recommended
Rules
- Cannot reduce visibility
- private methods → cannot override
- static methods → hidden, not overridden
- final methods → cannot override
- Constructors → cannot override
- Return type → same or covariant
Overloading vs Overriding
	Overloading	Overriding
Type	Compile-time	Runtime
Inheritance	Not required	Required
Method name	Same	Same
Parameters	Different	Same
Return type	Cannot alone differ	Same / Covariant
Binding	Early / Static	Late / Dynamic


Fields Are Not Polymorphic
- Fields are not overridden
- Field access depends on reference type
- Method execution depends on actual object
Important Rule
Fields → Reference Type
Overridden Methods → Actual Object

Static Methods
- Belong to the class
- Not runtime polymorphic
- Child static method → method hiding
- Selected based on reference/class type
Static → Compile-time
Overridden instance method → Runtime

Private Methods
- Accessible only inside declaring class
- Not inherited
- Cannot be overridden
- No runtime polymorphism
Final Methods
- final method → cannot be overridden
- Used when parent wants to prevent changing specific behavior
Constructors
- Used for object initialization
- Not inherited
- Cannot be overridden
- Not polymorphic
Abstract Class + Polymorphism
- Abstract class → cannot be directly instantiated
- Can contain:
  - Abstract methods
  - Concrete methods
  - Fields
  - Constructors
- Child classes implement abstract behavior
- Parent reference → can point to different child objects
- Combines abstraction + polymorphism
Interface + Polymorphism
- Interface → contract
- Multiple classes → different implementations
- Interface reference → can point to any implementation
- Major real-world use of polymorphism
Example:
Payment
 ├── UPI
 ├── Card
 └── Cash

All implement:
pay()

But each provides different behavior.
Spring Boot Connection
Polymorphism is heavily used with Dependency Injection.
Interface
    ↓
Multiple Implementations
    ↓
Spring Container
    ↓
Dependency Injection
    ↓
Runtime Polymorphism

Example:
PaymentService
      ↓
Payment interface
      ↓
 ┌─────────────┬─────────────┐
 ↓             ↓             ↓
UPIPayment   CardPayment   CashPayment

Consumer depends on:
Payment

not a specific implementation.
Benefits
- Loose coupling
- Easy implementation replacement
- Easier unit testing
- Better maintainability
- Better extensibility
- Supports Open/Closed Principle
Strategy Pattern
Polymorphism is commonly used in the Strategy Pattern.
Strategy
 ├── StrategyA
 ├── StrategyB
 └── StrategyC

- Common interface
- Different algorithms/behaviors
- Implementation can be selected at runtime
Common backend examples:
- Payment strategies
- Notification strategies
- Authentication strategies
- Pricing strategies
- File storage strategies
Covariant Return Type
- Overridden method can return a subtype of parent's return type
Concept:
Parent method → Animal
Child method  → Dog

If:
Dog extends Animal

then child can return Dog.
Why Polymorphism?
- Loose coupling
- Flexibility
- Extensibility
- Code reuse
- Maintainability
- Easier testing
- Implementation swapping
- Reduces dependency on concrete classes
- Supports Open/Closed Principle
Object Substitutability
If:
Dog extends Animal

then Dog should be usable wherever Animal is expected.
This is the basic idea behind Liskov Substitution Principle (LSP).
Child objects should be usable in place of their parent without breaking expected behavior.

Common Interview Traps
- Overloading → compile time
- Overriding → runtime
- Fields → not polymorphic
- Static methods → hidden, not overridden
- Private methods → cannot be overridden
- Final methods → cannot be overridden
- Constructors → cannot be overridden
- Return type alone → cannot overload
- Wrong downcast → ClassCastException
- instanceof → runtime type checking
- Java → always pass-by-value
- Object reference value → can be copied, causing multiple references to same object
Core Mental Model
Whenever you see:
Parent ref = new Child();

Ask:
1. What can I access?
Parent

2. Which overridden method runs?
Child

3. What about fields?
Reference Type

4. What about static methods?
Reference / Class Type

Core Flow
Parent / Interface
       ↓
Multiple Implementations
       ↓
Common Reference
       ↓
Same Method Call
       ↓
Different Runtime Behavior

Interview Definition
Polymorphism allows one common parent/interface reference to represent different object types, enabling different implementations of the same behavior.