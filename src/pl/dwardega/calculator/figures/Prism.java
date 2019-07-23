package pl.dwardega.calculator.figures;

public class Prism {
    private Figure basis;
    private double height;

    public Prism(Figure figure, double height)throws IllegalArgumentException{
        if (figure == null)
            throw new IllegalArgumentException("Wrong figure");
        basis = figure;
        if (height <= 0.0)
            throw new IllegalArgumentException("Height must be positive number");
        this.height = height;
    }

    public double calculateVolume(){
        return basis.calculateArea()*height;
    }

    public double calculateArea(){
        return basis.calculatePerimeter()*height;
    }

    public String toString() {
        return "Prism basis:\n\n" +basis+
                "\n\nPrism height: "+height+
                "\nArea: "+calculateArea()+
                "\nVolume: "+calculateVolume();
    }

    public void print(){
        System.out.println(this);
    }
}
