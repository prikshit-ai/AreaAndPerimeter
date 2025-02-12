
public class circle extends Shape {
    public circle (double radius){
        super(radius,0,0,0);


    }
    public double calculateArea() {
        return Math.PI * (this.dim_one * this.dim_one);
     }
  
     public double calculatePerimeter() {
        return 2.0 * Math.PI * this.dim_one;
     }

    
}
