package pl.dwardega.calculator.figures;

public class Rectangle extends Figure implements Printable {
    private double width, height;


    public Rectangle(double height, double width)throws IllegalArgumentException{
        if ( height <= 0.0 && width <= 0.0)
            throw new IllegalArgumentException("All sides - height and width - must be positive number");
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(width+height);
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    public String toString(){
        return "Figure: Rectangle" +
                "\nSides: "+width+", "+height+
                "\nArea: "+calculateArea()+
                "\nPerimeter: "+calculatePerimeter();
    }
}
