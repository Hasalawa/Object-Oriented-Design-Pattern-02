# 🔔 Decorator Design Pattern - Notification System

**[EN]** This project demonstrates the **Decorator Design Pattern** using a real-world E-commerce Notification System.

**[SI]** මෙම ව්‍යාපෘතිය මගින් ප්‍රායෝගික E-commerce දැනුම්දීම් පද්ධතියක් (Notification System) හරහා **Decorator Design Pattern** හි ක්‍රියාකාරීත්වය පෙන්වා දෙයි.

---

## 📖 What is the Decorator Pattern? | ඩෙකරේටර් පැටර්න් යනු කුමක්ද?

**[EN]**
The Decorator is a structural design pattern that allows you to dynamically add new behaviors or responsibilities to an object at runtime, without altering its original codebase. It achieves this by wrapping the original object inside a "Decorator" (Wrapper) object.

**[SI]**
Decorator යනු දැනට පවතින Object එකක මූලික කේතය (Source code) වෙනස් නොකර, ධාවන කාලයේදී (Runtime) ඊට අලුත් ක්‍රියාකාරකම් එකතු කිරීමට ඉඩ සලසන මෘදුකාංග සැලසුම් රටාවකි (Structural Design Pattern). මෙහිදී අලුත් ක්‍රියාකාරකම් එකතු කරන්නේ මූලික Object එක වටා අලුත් Objects ආවරණය (Wrap) කිරීම මගිනි.

---

## 🌍 The Real-World Scenario | ප්‍රායෝගික උදාහරණය

**[EN] The Problem:**
In our E-commerce system, every user must receive an **Email** when an order is placed. However, VIP users also need an **SMS**, and for security, we need to **Log** the notification process. If we use standard inheritance, we would have to create multiple combinations like `EmailWithSmsNotifier`, `EmailWithLoggingNotifier`, `EmailWithSmsAndLoggingNotifier` (Class Explosion).

**[SI] ගැටළුව:**
අපගේ E-commerce පද්ධතියේ order එකක් දැමූ විට අනිවාර්යයෙන්ම **Email** එකක් යැවිය යුතුය. නමුත් VIP පාරිභෝගිකයින්ට ඊට අමතරව **SMS** එකක්ද යැවිය යුතු අතර, පද්ධතියේ ආරක්ෂාවට මෙම ක්‍රියාවලිය **Log** කළ යුතුය. සාමාන්‍ය Inheritance භාවිතා කළහොත් අපට මේ සෑම සංකලනයක් සඳහාම අලුතින් Classes ලිවීමට සිදුවේ (උදා: `EmailWithSmsNotifier`). මෙය කේතය අතිශයින් සංකීර්ණ කරයි.

**[EN] The Solution:**
Instead of creating many classes, we create a base `EmailNotifier` object. Then, we wrap it inside an `SmsDecorator` and a `LoggingDecorator` as needed at runtime.

**[SI] විසඳුම:**
අලුතින් පන්ති (Classes) ගොඩක් සාදනවා වෙනුවට, මූලික ඊමේල් යැවීමේ Object එක (`EmailNotifier`) වටා අපට අවශ්‍ය පරිදි SMS සහ Logging පහසුකම් සපයන Decorators, ධාවන කාලයේදී (runtime) දවටනු (wrap කරනු) ලැබේ.

---

## 🔄 The Flow of Execution | ක්‍රියාත්මක වන ආකාරය

**[EN]** How does `new LoggingDecorator(new SmsDecorator(new EmailNotifier()));` actually work?
**[SI]** කේතය ක්‍රියාත්මක වන විට පණිවිඩය ගමන් කරන ආකාරය (Flow එක):

1. **Client** calls `send()` on the outermost wrapper (`LoggingDecorator`).
2. `LoggingDecorator` calls `super.send()`, passing the request to the `SmsDecorator`.
3. `SmsDecorator` calls `super.send()`, passing the request to the base `EmailNotifier`.
4. `EmailNotifier` executes its task: **Prints "Sending Email..."**
5. Control returns to `SmsDecorator`, which executes its extra task: **Prints "Sending SMS..."**
6. Control returns to `LoggingDecorator`, which executes its extra task: **Prints "Logging details..."**

**Execution Diagram (Output Order):**

```text
[ Client ] 
   │
   ▼
┌───────────────────────────────────────────────┐
│ LoggingDecorator                              │
│  ┌─────────────────────────────────────────┐  │
│  │ SmsDecorator                            │  │
│  │  ┌───────────────────────────────────┐  │  │
│  │  │ EmailNotifier (Base Component)    │  │  │
│  │  │ 1. Executes: Sending Email        │  │  │
│  │  └───────────────────────────────────┘  │  │
│  │ 2. Executes: Sending SMS                │  │
│  └─────────────────────────────────────────┘  │
│ 3. Executes: Logging details                  │
└───────────────────────────────────────────────┘

```

---

## 📂 Project Structure | ව්‍යාපෘතියේ ව්‍යුහය

* **`Notifier`** (Interface) :
  [EN] The common interface. / [SI] සියලුම දැනුම්දීම් සඳහා පොදු අතුරුමුහුණත.
* **`EmailNotifier`** (Concrete Component) :
  [EN] The base object. / [SI] මූලික ඊමේල් ක්‍රියාවලිය අඩංගු ප්‍රධාන පන්තිය.
* **`NotifierDecorator`** (Base Decorator) :
  [EN] Abstract class that holds the wrapped object. / [SI] අලුත් විශේෂාංග එකතු කරන පන්ති සඳහා මූලික සැකිල්ල සපයන Abstract පන්තිය.
* **`SmsDecorator` & `LoggingDecorator**` (Concrete Decorators) :
  [EN] The classes adding new features. / [SI] SMS සහ Logging වැනි අලුත් විශේෂාංග ප්‍රායෝගිකව එකතු කරන පන්ති.
* **`OrderService`** (Client) :
  [EN] Main class to run the application. / [SI] වැඩසටහන ධාවනය කරන ප්‍රධාන පන්තිය.

---

## 🚀 How to Run | ක්‍රියාත්මක කරන ආකාරය

**[EN]**

1. Open the project in your IDE (IntelliJ IDEA, Eclipse, etc.).
2. Navigate to `src/com/callisto/notification/OrderService.java`.
3. Run the `main` method.

**[SI]**

1. ඔබගේ IDE එකෙහි (IntelliJ IDEA) ව්‍යාපෘතිය විවෘත කරන්න.
2. `src/com/callisto/notification/OrderService.java` ගොනුව වෙත යන්න.
3. එහි ඇති `main` method එක Run කරන්න.

### ✅ Expected Output | ලැබෙන ප්‍රතිදානය:

```text
--- Basic Customer (Email Only) ---
Sending Email: Your order #8956 has been confirmed!

--- VIP Customer (Email + SMS + Logging) ---
Sending Email: Your order #8956 has been confirmed!
Sending SMS: Your order #8956 has been confirmed!
Logging the notification details to the system.

```

---

## ⭐ Advantages of this Pattern | මෙම සැලසුමේ වාසි

* **[EN] Single Responsibility Principle:** Divides functionality into classes with unique areas of concern.
* **[SI] තනි වගකීමේ මූලධර්මය (Single Responsibility):** එක් පන්තියකට එක් කාර්යයක් පමණක් පැවරීම නිසා කේතය කළමනාකරණය පහසු වේ.
* **[EN] Open/Closed Principle:** You can introduce new decorators (e.g., `WhatsAppDecorator`) without changing existing code.
* **[SI] Open/Closed මූලධර්මය:** අනාගතයේදී පරණ කේතය කිසිවක් වෙනස් නොකර `WhatsAppDecorator` වැනි අලුත් පහසුකම් ඉතා සුමටව එකතු කළ හැක.