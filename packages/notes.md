# Packages in Java

A **package** groups related classes, avoids name clashes, and controls **visibility** across your codebase. It maps directly to folders on disk.

## Folder layout in this example

```
packages/
├── PackageDemo.java          → package packages;
├── notes.md
└── app/
    ├── model/
    │   └── Product.java      → package packages.app.model;
    ├── service/
    │   └── ShopService.java  → package packages.app.service;
    └── util/
        ├── Formatter.java    → package packages.app.util;   (public)
        └── InternalHelper.java → package packages.app.util; (package-private)
```

**Rule:** `package packages.app.model;` must live in `packages/app/model/Product.java` (path mirrors the package name with `.` as folder separators).

## What each file teaches

| File | Idea |
|------|------|
| `Product.java` | `public` class in its own file; filename = class name |
| `Formatter.java` | Class in one package **imports** a class from another package |
| `InternalHelper.java` | **No** `public` on the class → only usable inside `packages.app.util` |
| `ShopService.java` | Wiring types from `model` and `util` |
| `PackageDemo.java` | `import` vs **fully qualified** name (`packages.app.util.Formatter`) |

## Package declaration

Every `.java` file (except default package) starts with:

```java
package packages.app.model;
```

- Convention: **lowercase**, often reversed domain (`com.company.project`).
- One public top-level class per file, and the file name must match that class.

## Importing

```java
import packages.app.model.Product;
```

- Imports are for **other packages** — you never need to import classes in the *same* package.
- `import packages.app.util.*;` imports all public types from `util` (wildcard — fine for learning, use sparingly in real projects).
- Same class name in two packages? Use full names or import only one and qualify the other.

## Visibility and packages

| Modifier | Same class | Same package | Subclass (other pkg) | Anywhere |
|----------|------------|--------------|----------------------|----------|
| `private` | yes | no | no | no |
| (default) | yes | yes | no | no |
| `protected` | yes | yes | yes | no |
| `public` | yes | yes | yes | yes |

`InternalHelper` has **default** (package) access, so `PackageDemo` cannot use it — only `Formatter` in the same `util` package can.

## Default package

Classes in the project root with **no** `package` line are in the unnamed default package. Libraries and shared code almost always use named packages (like the other folders here: `basics`, `classes`, etc.).

## How to compile and run

From the project root (`java-learning`):

```bash
javac packages/PackageDemo.java packages/app/model/Product.java packages/app/service/ShopService.java packages/app/util/Formatter.java packages/app/util/InternalHelper.java
java packages.PackageDemo
```

`javac` writes `.class` files next to the sources, keeping the same folder structure. The JVM loads classes by **fully qualified name** (e.g. `packages.app.model.Product`).

## Key ideas

- Packages organize code and prevent `Product` in one module from colliding with `Product` in another.
- **Public** API classes are exposed; hide helpers with package-private or `private`.
- Your other learning folders (`basics`, `classes`, `inheritance`, …) each use one package name matching the folder — this `packages` example shows **nested** packages under `packages.app.*`.

## Relation to the rest of this repo

| Folder | Package |
|--------|---------|
| `basics/` | `basics` |
| `classes/` | `classes` |
| `encapsulation/` | `encapsulation` |
| `inheritance/` | `inheritance` |
| `arrays/` | `arrays` |
| `strings/` | `strings` |
| `packages/` | `packages` and `packages.app.*` |
