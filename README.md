# 📘 Java Assignment Project
📌 Overview

This is a simple Java console-based application that demonstrates multiple programming concepts such as:

User input handling
Conditional statements & loops
Arrays and algorithms
Enums
Basic validation using Regular Expressions

The program provides a menu-driven interface where users can choose different functionalities.

# 🚀 Features
1️⃣ Sales Calculator
Simulates buying products
Tracks:
Total items purchased
Quantity per product
Total price
Products included:
Product 1
Product 2
Product 3
# 2️⃣ Password Checker
Validates password strength using regex
Requirements:
At least 1 lowercase letter
At least 1 uppercase letter
At least 1 digit
At least 1 special character (@$!%*?&)
Minimum 8 characters
# 3️⃣ Guthrie Sequence Checker
Checks whether an array follows a Guthrie sequence
Rules:
If number is even → divide by 2
If number is odd → multiply by 3 and add 1
Sequence must end with 1
Output:
1 → valid sequence
0 → invalid sequence
# 4️⃣ Days of the Week (Enum)
Uses enum to represent days
User enters a number (1–7)
Displays corresponding day
# 5️⃣ Order Status (Enum)
Demonstrates order lifecycle:
Pending
Shipped
Delivered
Cancelled
🛠️ Technologies Used
Java
Scanner (for input)
Regex (for validation)
Enums
# ▶️ How to Run
Compile the program:
javac Assighment.java
Run the program:
java Assighment
# 📂 Project Structure
Assighment.java
│
├── Products         // Handles sales calculation
├── password         // Validates password strength
├── Colats           // Guthrie sequence checker
├── Day (enum)       // Days of week
├── Order_Status     // Order states
└── Assighment       // Main class with menu
# ⚠️ Notes
The program runs in a loop until the user exits.
Input validation is basic; invalid inputs may cause errors.
Some class and variable names contain typos (e.g., Assighment, Salse, Cancled) but do not affect functionality.
✨ Future Improvements
Fix naming conventions (use standard Java naming)
Add input validation (try-catch)
Improve UI formatting
Store data using collections
Add GUI (JavaFX / Swing)
# 👤 Author

Kaleb Asfaw
