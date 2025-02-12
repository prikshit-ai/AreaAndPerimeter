import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of rectangle ");
        double length = Double.parseDouble(scan.nextLine());
        System.out.println("enter width of rectangle ");
        double width = Double.parseDouble(scan.nextLine());

    
    Shape Rectangle = new Rectangle(length,width);
    System.out.println("_________________");
    System.out.println("area of rectangle .."+ Rectangle.calculateArea());
    System.out.println("_________________");
    System.out.println("Perimeter of rectangle .."+ Rectangle.calculatePerimeter());
    System.out.println("_________________");
    System.out.println("sides of rectangle .."+ Rectangle.getNumSides());

    // circle 

    System.out.println("enter radius of circle ");
    double radius = Double.parseDouble(scan.nextLine());
    Shape circle = new circle(radius);
    System.out.println("_________________");
    System.out.println("area of circle .."+ circle.calculateArea());
    System.out.println("_________________");
    System.out.println("Perimeter of circle .."+ circle.calculatePerimeter());
    System.out.println("_________________");
    System.out.println("sides of circle .."+ circle.getNumSides());
        


    
    }
}
