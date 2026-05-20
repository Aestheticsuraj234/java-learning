# Basics: Control Flow (Loops)

This folder covers fundamental **control flow** in Java — how you repeat actions with loops.

## Concepts in `Hello.java`

| Loop | When to use |
|------|-------------|
| **for** | Known number of iterations (e.g. `i = 1` to `10`) |
| **while** | Repeat while a condition is true; check condition *before* each iteration |
| **do-while** | Same as `while`, but runs the body *at least once*, then checks the condition |

The sample nests a `while` inside a `for`, which is common for patterns like “for each row, process columns.”

## How to run

From the project root:

```bash
javac basics/Hello.java
java basics.Hello
```

## Key ideas

- Loop variables (`i`, `j`) are scoped to the block `{ }` where they are declared.
- `System.out.println()` prints a line and moves to the next line.
- Commented code in the file shows a **do-while** example you can uncomment to compare with `for` and `while`.
