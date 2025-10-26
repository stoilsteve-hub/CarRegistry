🚗 Car Ownership Transfer Simulation
Java OOP License

A simple Java program that simulates car ownership and sales transactions between different owners.
This project demonstrates basic object-oriented programming (OOP) principles such as encapsulation, object relationships, and method interaction.

📘 Overview
The program creates a few car owners and cars, prints the initial ownership information, performs a couple of sales transactions, and then prints the updated ownership details.

This is a lightweight example perfect for beginners learning Java classes, objects, and method interaction.

🧱 Class Structure
🧍 CarOwner
Represents an individual who owns a car.

Attributes

name — owner's full name
address — owner's address
age — owner's age
🚙 Car
Represents a car that belongs to a CarOwner.

Attributes

registrationNumber — unique identifier (e.g., "XYZ48N")
model — car model (e.g., "XC60")
brand — manufacturer (e.g., "Volvo")
owner — the current CarOwner
Method

sell(CarOwner newOwner) — transfers ownership to another person.
🏁 Main
The program entry point.

Main flow:

Creates CarOwner objects
Creates Car objects associated with the owners
Prints initial ownership
Executes car sales using the sell() method
Prints updated ownership information
💻 Example Output
Initial ownership:
XYZ48N is owned by Stoil Zhelyazkov
RBC48N is owned by Sergej Ryderholm

After sales:
XYZ48N is now owned by Sergej Ryderholm
RBC48N is now owned by Stoil Zhelyazkov
