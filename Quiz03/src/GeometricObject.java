
public class GeometricObject {
//superclass

    public GeometricObject() {
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
//extending the superclass over the subclass
public class Triangle extends GeometricObject {

	//defines the class
    private String color;
    private boolean filled;
    //sets the default values of the triangles
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

//beings the triangle
    public Triangle() {
    }


    public Triangle(double side1, double side2, double side3) {
    }
//gets and sets values of the triangle
    public double getSide1() {
        return side1;
    }

    public void setSide1(double val) {
        this.side1 = val;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double val) {
        this.side2 = val;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double val) {
        this.side3 = val;
    }

    //returns area using formula for finding area of a triangle
    @Override
    public double getArea() {

        double p = getPerimeter() / 2.0;
        
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    
    

    //required method to find perimeter
    @Override
    public double getPerimeter() {
    	//adds sides together and returns value
        return side1 + side2 + side3;
    }


    @Override
    public String toString() {
    	//returns string description
        return "Area = " + String.format("%.2f", getArea()) + "; Perimeter = " +
                String.format("%.2f", getPerimeter()) + "; Color = " +
                getColor() + "; Filled = " + getFilled();
    }
    
   
    public String getColor() {
        return color;
    }

    public void setColor(String val) {
        this.color = val;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean val) {
        this.filled = val;
    }
}


}
