# 🚗 Car Ownership Transfer Simulation

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![OOP](https://img.shields.io/badge/Concepts-OOP-blue)
![License](https://img.shields.io/badge/License-MIT-green)

A simple Java program that simulates **car ownership and sales transactions** between different owners.  
This project demonstrates basic **object-oriented programming (OOP)** principles such as encapsulation, object relationships, and method interaction.

---

## 📘 Overview

The program creates a few car owners and cars, prints the initial ownership information, performs a couple of sales transactions, and then prints the updated ownership details.

This is a lightweight example perfect for beginners learning Java classes, objects, and method interaction.

---

## 🧱 Class Structure

### 🧍 `CarOwner`
Represents an individual who owns a car.

**Attributes**
- `name` — owner's full name
- `address` — owner's address
- `age` — owner's age

---

### 🚙 `Car`
Represents a car that belongs to a `CarOwner`.

**Attributes**
- `registrationNumber` — unique identifier (e.g., `"XYZ48N"`)
- `model` — car model (e.g., `"XC60"`)
- `brand` — manufacturer (e.g., `"Volvo"`)
- `owner` — the current `CarOwner`

**Method**
- `sell(CarOwner newOwner)` — transfers ownership to another person.

---

### 🏁 `Main`
The program entry point.

**Main flow:**
1. Creates `CarOwner` objects
2. Creates `Car` objects associated with the owners
3. Prints initial ownership
4. Executes car sales using the `sell()` method
5. Prints updated ownership information

---

## 💻 Example Output

```text
Initial ownership:
XYZ48N is owned by Stoil Zhelyazkov
RBC48N is owned by Sergej Ryderholm

After sales:
XYZ48N is now owned by Sergej Ryderholm
RBC48N is now owned by Stoil Zhelyazkov
