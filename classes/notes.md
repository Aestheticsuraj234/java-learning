# Classes and Objects

This folder introduces **object-oriented programming** in Java: defining a class, creating an object, and calling methods.

## Concepts in `Demo.java`

| Term | Meaning |
|------|---------|
| **Class** | Blueprint (`A`) — fields and methods that describe a type |
| **Object** | Instance created with `new A()` |
| **Constructor** | `public A()` runs when the object is created |
| **Method** | Behavior on the object, e.g. `obj.show()` |
| **`main`** | Entry point; must be `public static void main(String[] args)` |

`Demo` is the class with `main`. Class `A` is a separate type used to demonstrate instantiation.

## How to run

From the project root:

```bash
javac classes/Demo.java
java classes.Demo
```

## Key ideas

- **Reference vs object:** `A obj` declares a reference; `obj = new A()` allocates the object on the heap.
- **Default constructor:** If you write no constructor, Java supplies a no-arg constructor. Here, `A()` prints when the object is built.
- **Primitives vs objects:** `int marks` is a primitive stored on the stack in `main`; `A obj` holds a reference to an object.
