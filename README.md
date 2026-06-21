# NGO Management System

A Java-based console application designed to help nonprofit organizations manage beneficiaries, donors, and donations efficiently.

## Project Overview

Many nonprofit organizations maintain beneficiary and donor records manually. This project provides a simple digital solution for:

- Managing beneficiary information
- Managing donor records
- Tracking donations
- Generating NGO reports

The application is developed using Java and follows Object-Oriented Programming (OOP) principles.

---

## Features

### Beneficiary Management
- Add beneficiary
- View all beneficiaries
- Search beneficiary by ID

### Donor Management
- Add donor
- View all donors

### Donation Management
- Record donations
- View donation history

### Reporting
- Total beneficiaries
- Total donors
- Total donation amount

---

## Technologies Used

- Java
- BlueJ
- Object-Oriented Programming
- ArrayList Collections
- Console-based User Interface

---

## Project Structure

```
NGO-Management-System/
│
├── Beneficiary.java
├── Donor.java
├── Donation.java
├── NGOManager.java
├── Main.java
└── README.md
```

---

## Class Description

### Beneficiary
Stores information about people receiving NGO support.

Attributes:
- ID
- Name
- Age
- Program

### Donor
Stores donor details.

Attributes:
- ID
- Name
- Email

### Donation
Stores donation transaction information.

Attributes:
- Donor ID
- Amount

### NGOManager
Handles all application operations:
- Beneficiary management
- Donor management
- Donation management
- Report generation

### Main
Provides the menu-driven user interface.

---

## Concepts Used

- Classes and Objects
- Encapsulation
- Constructors
- ArrayList
- Method Calls
- Menu Driven Programming
- Object-Oriented Design

---

## Sample Report

```
===== NGO REPORT =====
Total Beneficiaries : 5
Total Donors        : 3
Total Donations     : Rs.15000
======================
```

---

## Future Enhancements

- File handling for data persistence
- Delete and update operations
- GUI using Java Swing
- Database integration using MySQL
- Export reports to PDF

---

## Author

Developed as a Java project for learning OOP concepts and NGO management workflows.
