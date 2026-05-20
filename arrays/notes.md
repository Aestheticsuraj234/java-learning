# Arrays (and arrays of objects)

This folder covers **arrays** in Java, especially an array of **custom objects** (`Students[]`).

## Concepts in `Array_Learning.java`

| Idea | Example in comments |
|------|---------------------|
| **Class as data record** | `Students` with `rollno`, `name`, `marks` |
| **Object creation** | `new Students()` then assign fields |
| **Array declaration** | `Students students[] = new Students[3];` |
| **Indexing** | `students[0] = s1;` — zero-based, length 3 means indices 0–2 |

## Array basics (Java)

- Fixed length once created: `new Students[3]` has exactly 3 slots.
- Elements of an object array start as **`null`** until you assign an object.
- Syntax alternatives: `Students[] students` and `Students students[]` are both valid; the first style is more common today.

## How to run

Uncomment the sample code in `main`, then from the project root:

```bash
javac arrays/Array_Learning.java
java arrays.Array_Learning
```

## Key ideas

- An array of objects stores **references**, not copies of the whole object (unless you clone).
- To loop: `for (int i = 0; i < students.length; i++)` or enhanced `for (Students s : students)`.
- For growable lists, the JDK offers `ArrayList<Students>` in `java.util` — arrays are the foundation.

## Next steps

Uncomment the block in `main`, add a loop to print each student, and try passing the array to a method that prints a report.
