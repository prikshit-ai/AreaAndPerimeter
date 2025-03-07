Shape and Volume Calculator (Java)

Overview

This project is a Java-based Shape and Volume Calculator that demonstrates Object-Oriented Programming (OOP) concepts such as abstraction, inheritance, interfaces, and method overriding. It allows users to calculate area, perimeter, and volume for various 2D and 3D shapes based on user input.

Concepts Used

✔ Abstract Classes – Shape.java defines a base class for all shapes with common properties and abstract methods.
✔ Interfaces – Volume.java is an interface for 3D shapes that require a calculateVolume() method.
✔ Encapsulation – Uses protected attributes to store shape dimensions.
✔ Inheritance – Each shape class extends the abstract Shape class to implement its own area and perimeter calculations.
✔ Method Overriding – Each shape provides a specific implementation for calculateArea() and calculatePerimeter().
✔ Polymorphism – Shapes are instantiated dynamically at runtime.
✔ User Input Handling – The program prompts the user to enter dimensions for various shapes.
✔ Modular Code Structure – Separate files for each shape improve readability and maintainability.

Functionality

2D Shapes:
Circle – Calculates area and circumference.
Rectangle – Calculates area and perimeter.
Square – Calculates area and perimeter.
3D Shapes (Implementing Volume Interface):
Sphere – Calculates surface area and volume.
Cylinder – Calculates surface area and volume.
Equilateral Pyramid (Square Base) – Calculates surface area and volume.
Menu-Driven Execution:
The program prompts the user to enter shape dimensions.
It then calculates area, perimeter, and volume (where applicable) and displays the results.
Project Structure

📂 ShapeVolumeCalculator
│── Shape.java              # Abstract class for shapes
│── Volume.java             # Interface for 3D shapes
│── Circle.java             # Implements Shape for Circle
│── Rectangle.java          # Implements Shape for Rectangle
│── Square.java             # Implements Shape for Square
│── Sphere.java             # Implements Shape + Volume for Sphere
│── Cylinder.java           # Implements Shape + Volume for Cylinder
│── EquilateralPyramid.java # Implements Shape + Volume for Equilateral Pyramid
│── Main.java               # Runs the program (User input + execution)
│── README.md               # Project documentation
Summary

This project provides a structured approach to working with geometrical shapes in Java using OOP principles. By leveraging abstract classes, interfaces, and method overriding, the program ensures code reusability, scalability, and maintainability. 🚀
