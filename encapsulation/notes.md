# Encapsulation

**Encapsulation** means bundling data and behavior inside a class and **hiding internal state** behind controlled access (getters/setters).

## Concepts in `Encapsultation.java`

| Piece | Role |
|-------|------|
| `private` fields | `age` and `name` cannot be read or written from outside `Human` |
| **Constructor** | Sets initial state in one place |
| **Getters** | `getAge()`, `getName()` — safe read access |
| **Setters** | `setAge()`, `setName()` — controlled write access |
| **`this`** | Refers to the current object (e.g. `this.age = age` disambiguates parameter vs field) |

## Why encapsulate?

- **Validation:** Setters can reject invalid values (e.g. negative age).
- **Flexibility:** You can change internal representation without breaking callers.
- **Clear API:** Outside code uses methods, not raw fields.

## How to run

From the project root:

```bash
javac encapsulation/Encapsultation.java
java encapsulation.Encapsultation
```

## Key ideas

- Prefer `private` fields + public getters/setters over public fields for types you expose as APIs.
- The filename keeps the spelling `Encapsultation` (common typo for *Encapsulation*); the concept is still encapsulation.
