# Salary Expectansee

## I. Project Overview

The **Salary Expectansee** is a Java-based application designed for employees to track their own working hours and calculate their estimated salary. This transparency empowers employees with an understanding of their earnings and fosters motivation to work harder. 

Additionally, the system provides administrators with tools to manage employee data, ensuring a balance of efficiency and fairness in workplace operations. Key functionalities include:

- Logging and viewing worked hours.
- Calculating and displaying salaries.
- Administering employee data, including adding and removing employees, as well as updating hourly rates.

This program is ideal for small businesses or organizations looking for a simple yet effective way to enhance employee transparency and productivity.

---

## II. Application of OOP Principles

The project heavily leverages Object-Oriented Programming (OOP) principles to ensure maintainable, modular, and scalable code:

1. **Encapsulation**:
   - Data related to employees, such as credentials, hourly rates, and time entries, is encapsulated within the `UserManager` class. Methods in this class control access and modification, ensuring data integrity.

2. **Inheritance**:
   - While inheritance isn't prominently utilized, the structure can be extended to include specialized user types (e.g., Manager) in the future.

3. **Polymorphism**:
   - Polymorphic behavior can be introduced in future iterations where employees or admins might have shared functionality with variations in execution.

4. **Abstraction**:
   - Complex operations like calculating salaries, clearing entries, or managing employee records are abstracted into relevant methods, keeping the core logic clean and understandable.

By organizing the project into classes such as `UserManager`, `AdminMenu`, and `EmployeeMenu`, the responsibilities are clearly delineated, adhering to the **Single Responsibility Principle** of clean coding.

---

## III. Integration of SDG Goal 8

The project aligns with **United Nations Sustainable Development Goal (SDG) 8: Decent Work and Economic Growth**, specifically targeting:

- **Promoting decent work conditions**: By tracking hours worked and ensuring accurate salary calculations, the system fosters fair labor practices.
- **Efficient resource management**: The administrator's ability to adjust hourly rates ensures businesses can manage payroll transparently and equitably.

The program emphasizes the importance of tracking productivity and compensating employees accurately, contributing to ethical workplace standards and sustainable economic practices.

---

## IV. Instructions for Running the Program

### Steps to Run:
1. Clone or download the source code.
2. Open the project in your IDE or navigate to the folder containing the source files in the command line.
3. Compile the program:
   ```
   javac Main.java
   ```
4. Run the program:
   ```
   java Main
   ```
5. Follow the on-screen instructions to log in as an admin or employee and explore the system’s features.

### Default Data:
For testing purposes, the following credentials are preloaded:
- **Admin**: Username: `Fatima`, Password: `FatimaPass`
- **Employee 1**: Username: `Kellyn`, Password: `Kellz`
- **Employee 2**: Username: `Marlou`, Password: `Marlz`

### Usage:
- Admin users can manage employee data, adjust hourly rates, and view employee records.
- Employees can log their work hours, view their salaries, and reset their records.

---

Start using the **Salary Expectansee** to foster better workplace management and support sustainable economic growth.

