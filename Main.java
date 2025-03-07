// Prikshit Gaur
// AIML - B1
// 23070126094

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Rectangle
        System.out.println("Enter length of rectangle:");
        double length = scan.nextDouble();
        System.out.println("Enter width of rectangle:");
        double width = scan.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());

        // Circle
        System.out.println("\nEnter radius of circle:");
        double radius = scan.nextDouble();
        Shape circle = new circle(radius);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());

        // Sphere
        System.out.println("\nEnter radius of sphere:");
        double sphereRadius = scan.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Surface Area of Sphere: " + sphere.calculateArea());
        System.out.println("Volume of Sphere: " + sphere.calculateVolume());

        // Cylinder
        System.out.println("\nEnter radius of cylinder:");
        double cylRadius = scan.nextDouble();
        System.out.println("Enter height of cylinder:");
        double cylHeight = scan.nextDouble();
        Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
        System.out.println("Surface Area of Cylinder: " + cylinder.calculateArea());
        System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());

        // Equilateral Pyramid
        System.out.println("\nEnter base side length of Equilateral Pyramid:");
        double pyramidBase = scan.nextDouble();
        System.out.println("Enter height of Equilateral Pyramid:");
        double pyramidHeight = scan.nextDouble();
        EquilateralPyramid pyramid = new EquilateralPyramid(pyramidBase, pyramidHeight);
        System.out.println("Surface Area of Pyramid: " + pyramid.calculateArea());
        System.out.println("Volume of Pyramid: " + pyramid.calculateVolume());

        scan.close();
    }
}
