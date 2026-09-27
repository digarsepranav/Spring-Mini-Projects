static void processPayment(Payment payment) {
payment.pay();
}

Yahan Payment reference hai, lekin actual object different ho sakta hai:
processPayment(new UPIPayment());
processPayment(new CardPayment());

Runtime par Java decide karta hai ki pay() kaunsa execute karna hai:
- new UPIPayment() → UPIPayment.pay()
- new CardPayment() → CardPayment.pay()
  Simple flow
  Payment reference
  ↓
  payment.pay()
  ↓
  Runtime checks actual object
  ↙             ↘
  UPIPayment     CardPayment
  ↓               ↓
  UPI Payment     Card Payment

Concepts involved:
1. Inheritance → UPIPayment extends Payment
2. Method Overriding → pay() ko child classes redefine kar rahi hain
3. Runtime Polymorphism / Dynamic Method Dispatch → actual method runtime par decide hota hai