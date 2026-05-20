# Strings

This folder introduces Java **text** types: immutable `String` and mutable `StringBuffer`.

## Concepts in `String_Learning.java`

| Type | Mutable? | Notes |
|------|----------|--------|
| **`String`** | No | Each change creates a new object; safe to share |
| **`StringBuffer`** | Yes | Thread-safe mutable sequence; `capacity()` is internal buffer size |

Creating a string:

```java
String name = new String("Suraj");
// Prefer literal when possible: String name = "Suraj";
```

`StringBuffer` is similar to **`StringBuilder`** (same API, but `StringBuilder` is not synchronized and is preferred for single-threaded code).

## How to run

From the project root:

```bash
javac strings/String_Learning.java
java strings.String_Learning
```

## Key ideas

- **`==` vs `.equals()`:** `==` compares references; `.equals()` compares character content for strings.
- **Immutability:** `"Suraj".toUpperCase()` returns a new string; the original is unchanged.
- **`capacity()`** on `StringBuffer`/`StringBuilder` is the current backing array size, not the logical length (`length()`).
- For most app code today, use **`String`** for text and **`StringBuilder`** for building strings in loops.

## Common `String` methods to try next

`length()`, `charAt(i)`, `substring()`, `contains()`, `split()`, `trim()`, `isEmpty()`.
