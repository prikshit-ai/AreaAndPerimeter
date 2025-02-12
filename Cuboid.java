

public class Cuboid extends Shape {
    public Cuboid(double length ,double width, double height){
        super(length,width,height,12);

    }
    public double calculateArea(){
        return 2 * ((dim_one * dim_two) + (dim_two * dim_three)+(dim_three * dim_one));
    }
    public double calculatePerimeter(){
        return 4 * (dim_one + dim_two + dim_three);
    }

}
