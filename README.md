# Object Oriented Design Patterns (OODP)

Welcome to the Object-Oriented Design Patterns repository! This project serves as a practical guide and implementation reference for 13 essential Gang of Four (GoF) design patterns. 

A design pattern is a reusable, proven solution to a commonly occurring problem in software design. Patterns help reduce tightly coupled classes, improve code extensibility, and provide a shared vocabulary for developers.

## Table of Contents
- [Creational Patterns](#creational-patterns)
- [Structural Patterns](#structural-patterns)
- [Behavioral Patterns](#behavioral-patterns)
- [Design Principles](#design-principles)

---

## Creational Patterns
*Creational patterns focus on how objects are instantiated, hiding the creation logic rather than directly instantiating objects using the `new` operator.*

### 1. Builder
* **Intent:** Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.
* **Use Case:** Constructing a complex `Meal` or `Document` step-by-step, where building involves multiple optional parts.

### 2. Prototype
* **Intent:** Creates new objects by copying (cloning) an existing instance, known as the prototype, rather than creating from scratch.
* **Use Case:** Generating multiple enemies in a game where initializing a new enemy from the database every time is too costly.

---

## Structural Patterns
*Structural patterns focus on how classes and objects are assembled or connected to form larger, flexible structures.*

### 3. Decorator
* **Intent:** Attaches additional responsibilities to an object dynamically at runtime by placing it inside compatible wrapper objects.
* **Use Case:** Adding optional features (like SMS, Push) to an `EmailNotifier` without creating a massive subclass hierarchy (Class Explosion).

### 4. Composite
* **Intent:** Composes objects into tree structures to represent whole-part hierarchies. Lets clients treat individual objects (Leaves) and groups of objects (Composites) uniformly.
* **Use Case:** A file system where a `Folder` can contain `Files` and other `Folders`, and the client can call `calculateSize()` on any of them uniformly.

### 5. Bridge
* **Intent:** Decouples an abstraction from its implementation so that both dimensions can vary independently. 
* **Use Case:** A `RemoteControl` hierarchy and a `TV` hierarchy that evolve separately. Instead of creating a `SonyAdvancedRemote`, the Remote holds a reference to the TV interface.

### 6. Adapter
* **Intent:** Converts a legacy or incompatible interface into the interface that the client expects, allowing incompatible classes to work together.
* **Use Case:** Wrapping a legacy third-party payment gateway API to match the interface required by your modern e-commerce application.

### 7. Flyweight
* **Intent:** Uses sharing to support large numbers of fine-grained objects efficiently, minimizing memory usage.
* **Use Case:** Rendering a forest with millions of trees in a game; instead of storing texture and mesh data per tree, it is shared, and only coordinates are stored per instance.

---

## Behavioral Patterns
*Behavioral patterns dictate how objects communicate, interact, and share responsibilities.*

### 8. Strategy
* **Intent:** Encapsulates a family of interchangeable algorithms, allowing the client to choose and swap them dynamically at runtime.
* **Use Case:** Selecting different sorting algorithms (MergeSort, QuickSort) or different Payment Methods (Credit Card, PayPal) at checkout.

### 9. Chain of Responsibility
* **Intent:** Passes a request along a chain of potential handlers until one of them handles the request.
* **Use Case:** An approval workflow where a purchase request is passed from a Manager to a Director, and finally to the CEO until someone with the correct authority approves it.

### 10. Interpreter
* **Intent:** Defines a representation for a grammar of a given language, along with an interpreter to evaluate sentences in the language.
* **Use Case:** Building a simple SQL parser, a mathematical expression evaluator, or a custom scripting language syntax.

### 11. Mediator
* **Intent:** Centralizes complex communications and control logic between multiple objects, preventing them from referring to each other explicitly.
* **Use Case:** An Air Traffic Control tower (Mediator) coordinating communication between multiple airplanes, preventing planes from talking directly to one another.

### 12. Memento
* **Intent:** Captures and externally stores an object's internal state without violating encapsulation, allowing the object to be restored later.
* **Use Case:** Implementing "Undo/Redo" functionality in a text editor or a save-state feature in a video game.

### 13. Visitor
* **Intent:** Represents an operation to be performed on elements of an object structure. Lets you define a new operation without changing the classes of the elements on which it operates.
* **Use Case:** Adding a new `ExportToXML` operation to a diverse tree of Document Nodes (Text, Image, Table) without modifying the node classes themselves.

---

## Design Principles
While studying these patterns, always keep the underlying design principles in mind:
* **Favor Object Composition over Class Inheritance:** Use wrappers and references (like in Bridge and Decorator) instead of exploding subclass trees.
* **Open/Closed Principle:** Classes should be open for extension but closed for modification. 
* **Program to an Interface, not an Implementation:** Keep systems loosely coupled to allow dynamic runtime behavior.

> *"The challenge is not writing code once. The challenge is changing it safely."*
