# Inheritance

**Inheritance** lets a class (**child / subclass**) reuse and extend another class (**parent / superclass**) with `extends`.

## Class hierarchy in `Inheritance.java`

```
A  (parent)
 └── B  (extends A)
      └── C  (extends B)
           └── D  (extends C)
```

Also: **B2** extends **A** — demonstrates `this()` constructor chaining in the same class.

## Main topics

| Topic | What to look for |
|-------|------------------|
| **`extends`** | `class B extends A` — B inherits fields and methods from A |
| **`super()`** | First line of a child constructor; calls parent constructor |
| **`this()`** | Calls another constructor in the *same* class (B2) |
| **Field shadowing** | `B` has its own `name`; `super.name` accesses the parent's field |
| **Method overriding** | `@Override` on `printName()` and `greet()` — child replaces parent behavior |
| **`super.method()`** | Call parent's version from an override |
| **Polymorphism** | `A parentRef = new B(...)` — reference type A, runtime object B; `greet()` runs B's version |

## Constructor chain

Creating `new D()` runs constructors from top to bottom: **A → B → C → D** (each `super()` links upward).

## Multiple inheritance

Java classes **cannot** extend more than one class. Multiple inheritance of *type* is done with **interfaces** (mentioned in comments at the bottom of the source file).

## How to run

From the project root:

```bash
javac inheritance/Inheritance.java
java inheritance.Inheritance
```

## Key ideas

- Overriding: same method signature, same or wider visibility, compatible return type.
- `@Override` is optional but recommended — the compiler checks you're actually overriding.
- Runtime method dispatch uses the **actual object type**, not only the reference type.
