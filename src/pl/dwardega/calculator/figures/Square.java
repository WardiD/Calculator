package pl.dwardega.calculator.figures;

public class Square extends Rectangle implements Printable {
    private double side;


    public Square(double side) throws IllegalArgumentException{
            super(side,side);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2.0);
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    public String toString(){
        return "Figure: Square" +
                "\nSide: "+side+
                "\nArea: "+calculateArea()+
                "\nPerimeter: "+calculatePerimeter();
    }
}
