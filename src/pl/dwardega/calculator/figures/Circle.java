package pl.dwardega.calculator.figures;

public class Circle extends Figure implements Printable {
    private double radius;

    public Circle(double radius)throws IllegalArgumentException{
        if ( radius <= 0.0)
            throw new IllegalArgumentException("Radius must be positive number");
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2.0);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    public String toString(){
        return "Figure: Circle" +
                "\nRadius: "+radius+
                "\nArea: "+calculateArea()+
                "\nPerimeter: "+calculatePerimeter();
    }
}
