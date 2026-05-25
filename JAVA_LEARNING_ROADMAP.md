# Java Learning Roadmap

A comprehensive guide to your Java learning journey, organized by topic progression.

---

## ✅ TOPICS COVERED

### **1. Basics: What is Java?**
- **Folder:** `basics/`
- **Topics:**
  - Loops: `for`, `while`, `do-while`
  - Loop nesting
  - Loop control (implicit in examples)
- **Files:** `Hello.java`, `notes.md`
- **Key Concepts:** Control flow, iteration

---

### **2. Data Types & Variables**
- **Folder:** `basics/`, `strings/`, `arrays/`
- **Topics:**
  - Primitive types (`int`, `String`)
  - String immutability vs mutability
  - String vs StringBuffer vs StringBuilder
  - Arrays (both primitives and objects)
- **Files:**
  - `strings/String_Learning.java` - String manipulation
  - `strings/notes.md`
  - `arrays/Array_Learning.java` - Arrays of objects
  - `arrays/notes.md`
- **Key Concepts:** 
  - `String` immutability
  - `StringBuffer` thread-safe mutability
  - `StringBuilder` for performance
  - Fixed-size arrays with indexing

---

### **3. Control Flow**
- **Folder:** `basics/`
- **Topics:**
  - Conditional flow embedded in loops
  - Loop iteration
- **Key Concepts:** Basic control structures

---

### **4. Classes & Objects**
- **Folder:** `classes/`
- **Topics:**
  - Class definition
  - Object instantiation with `new`
  - Constructors
  - Method calls
  - Instance fields and methods
  - `main()` entry point
- **Files:** `Demo.java`, `notes.md`
- **Key Concepts:**
  - Blueprint (class) vs instance (object)
  - Reference types vs primitives
  - Heap allocation

---

### **5. Encapsulation**
- **Folder:** `encapsulation/`
- **Topics:**
  - `private` fields
  - Public getters and setters
  - `this` keyword
  - Data hiding and validation
  - Constructor initialization
- **Files:** `Encapsultation.java`, `notes.md`
- **Key Concepts:**
  - Access modifiers (`private`, `public`)
  - Controlled access
  - Separation of concerns

---

### **6. Inheritance**
- **Folder:** `inheritance/`
- **Topics:**
  - `extends` keyword
  - Single inheritance chains (A → B → C → D)
  - `super()` constructor calling
  - `this()` constructor chaining
  - Method overriding with `@Override`
  - `super.method()` calls
  - Field shadowing
  - Polymorphism (reference vs object type)
  - Why Java doesn't support multiple inheritance
- **Files:** `Inheritance.java`, `notes.md`
- **Key Concepts:**
  - IS-A relationships
  - Reuse and extension
  - Runtime method dispatch

---

### **7. Interfaces & Abstract Classes**
- **Folder:** `interfaces/`, `abstract_/`
- **Topics:**
  - Interface definition and implementation
  - Abstract classes
  - Abstract methods
  - Method contracts
- **Files:**
  - `interfaces/interfaces.java`
  - `abstract_/Main.java`
- **Key Concepts:**
  - Contracts for behavior
  - Multiple interface implementation
  - Abstract type hierarchy

---

### **8. Polymorphism**
- **Folder:** `poly/`
- **Topics:**
  - Method overloading
  - Method overriding
  - Compile-time vs runtime polymorphism
  - Type casting and instanceof
- **Files:** `poly/poly.java`
- **Key Concepts:**
  - Same method name, different signatures
  - Dynamic dispatch

---

### **9. Exception Handling**
- **Folder:** `exceptions/`
- **Topics:**
  - Try-catch blocks
  - Finally block (always executes)
  - Multiple catch blocks
  - Exception hierarchy
  - Common exceptions:
    - `ArithmeticException` - Division by zero
    - `ArrayIndexOutOfBoundsException` - Invalid array index
    - `NullPointerException` - Null reference
    - `ClassCastException` - Invalid casting
    - `NumberFormatException` - Invalid number parsing
    - `StringIndexOutOfBoundsException` - Invalid string index
    - `IllegalArgumentException` - Invalid arguments
    - `NegativeArraySizeException` - Negative array size
  - Catching parent vs specific exceptions
- **Files:** `exceptions_.java`
- **Key Concepts:**
  - Error handling and recovery
  - Exception propagation
  - Clean-up code with finally

---

### **10. Enums**
- **Folder:** `enums/`
- **Topics:**
  - Enum definition
  - Enum constants
  - Using enums for type-safe choices
- **Files:** `enums.java`
- **Key Concepts:**
  - Fixed set of named constants
  - Type safety

---

### **11. Annotations**
- **Folder:** `annotations_/`
- **Topics:**
  - Annotation syntax and usage
  - Common annotations like `@Override`
  - Metadata for compiler/runtime
- **Files:** `annotations.java`
- **Key Concepts:**
  - Compiler hints
  - Documentation

---

### **12. Collections**
- **Folder:** `collection_/`
- **Topics:**
  - (Check the folder for specific collection types covered)
  - Likely: List, Set, Map, ArrayList, HashSet, HashMap
  - Iteration patterns
- **Files:** Check folder structure
- **Key Concepts:**
  - Dynamic sizing
  - Standard data structures

---

### **13. Packages & Organization**
- **Folder:** `packages/`
- **Topics:**
  - Package declaration (`package name;`)
  - Folder structure mapping
  - Import statements
  - Access modifiers and visibility:
    - `private` - Same class only
    - (default) - Same package only
    - `protected` - Same package + subclasses
    - `public` - Everywhere
  - Public vs package-private classes
  - Nested package structure (`packages.app.model`)
  - Fully qualified names
- **Files:**
  - `PackageDemo.java`
  - `app/model/Product.java`
  - `app/service/ShopService.java`
  - `app/util/Formatter.java`
  - `app/util/InternalHelper.java`
  - `notes.md`
- **Key Concepts:**
  - Code organization and namespacing
  - Visibility control
  - Module design

---

### **14. Streams & Functional Programming**
- **Folder:** `stream/`
- **Topics:**
  - (Check folder for specific coverage)
  - Likely: Stream API, map, filter, reduce
  - Lambda expressions
  - Functional interfaces
- **Files:** Check folder structure
- **Key Concepts:**
  - Declarative processing
  - Functional style

---

### **15. Threading & Concurrency**
- **Folder:** `threads_/`
- **Topics:**
  - (Check folder for specific coverage)
  - Thread creation and lifecycle
  - Runnable interface
  - Synchronization
- **Files:** Check folder structure
- **Key Concepts:**
  - Parallel execution
  - Thread safety

---

### **16. REST API**
- **Folder:** `restapi/`
- **Topics:**
  - (Check folder for specific coverage)
  - HTTP requests/responses
  - API design principles
- **Files:** `HelloApi.java`
- **Key Concepts:**
  - Web service basics

---

### **17. Input/Output**
- **Folder:** `scanner/`
- **Topics:**
  - User input with Scanner
  - Reading from console
  - Input parsing
- **Files:** Check folder structure
- **Key Concepts:**
  - I/O operations
  - User interaction

---

## ❌ TOPICS NOT YET COVERED

### **Fundamental Concepts**
- [ ] If-else statements (control flow)
- [ ] Switch statements (control flow)
- [ ] Ternary operator

### **Object-Oriented Programming**
- [ ] Static keyword (static fields, static methods, static blocks)
- [ ] Final keyword (immutable fields, sealed methods, sealed classes)
- [ ] Constructors (explicit coverage beyond basics)
- [ ] Method parameter passing (by value vs reference)
- [ ] Equals and hashCode methods
- [ ] toString() method
- [ ] Cloning and deep vs shallow copy
- [ ] Inner classes (nested, anonymous, local)
- [ ] Sealed classes and pattern matching

### **Collections & Generics**
- [ ] Generics (type parameters, wildcards, bounds)
- [ ] Collections hierarchy (Collection, List, Set, Map)
- [ ] Iteration (Iterator, enhanced for loop)
- [ ] Comparator and Comparable
- [ ] Collections utility class

### **Advanced Features**
- [ ] Regular Expressions (Regex)
- [ ] File I/O and NIO
- [ ] Serialization and Deserialization
- [ ] Reflection API
- [ ] Logging frameworks
- [ ] Date and Time API

### **Design Patterns**
- [ ] Singleton pattern
- [ ] Factory pattern
- [ ] Observer pattern
- [ ] Strategy pattern

### **Testing & Build**
- [ ] Unit testing (JUnit)
- [ ] Build tools (Maven, Gradle)
- [ ] Debugging techniques

---

## 📊 Coverage Summary

| Category | Coverage |
|----------|----------|
| **Basics** | ✅ Complete (loops, arrays, strings) |
| **OOP** | ✅ Very Good (classes, inheritance, encapsulation, polymorphism) |
| **Exception Handling** | ✅ Complete (try-catch-finally, all major exceptions) |
| **Collections** | 🔶 Partial (need to verify collection_ folder) |
| **Packages & Organization** | ✅ Complete |
| **Advanced Features** | ❌ Minimal (streams, threading, REST API - topics exist) |
| **Control Flow** | 🔶 Partial (loops yes, if-else/switch no) |
| **Generics** | ❌ Not covered |

---

## 🎯 Recommended Next Steps

1. **Add If-Else and Switch:** Create `basics/conditional.java` covering decision-making
2. **Add Static & Final:** Create `oop/static_final.java` for static fields/methods and immutability
3. **Add Collections Deep Dive:** Ensure `collection_/` covers List, Set, Map with examples
4. **Add Generics:** Create `generics/` folder for type-safe collections
5. **Add Regular Expressions:** Create `regex/` for pattern matching
6. **Add File I/O:** Create `io/` for file operations
7. **Add Design Patterns:** Create `patterns/` for common OOP patterns

---

## 🚀 Learning Path Progression

**Beginner Level:**
1. Basics (loops)
2. Variables & Data Types (arrays, strings)
3. Control Flow (loops, if-else, switch)
4. Classes & Objects

**Intermediate Level:**
5. Encapsulation
6. Inheritance
7. Polymorphism
8. Interfaces & Abstract Classes

**Advanced Level:**
9. Exception Handling
10. Collections & Generics
11. Packages & Organization
12. Streams & Functional Programming

**Expert Level:**
13. Threading & Concurrency
14. File I/O & Serialization
15. Design Patterns
16. REST APIs & Web Services

---

**Last Updated:** May 25, 2026
