package pl.dwardega.calculator.figures;

public class Triangle extends Figure implements Printable{

    private double sideA,sideB,sideC;
    private double angleAB, angleBC, angleAC;

    /* char options:
        s - values for all sides,
        a - values for 2 angles and side between (angleAB, angle AC, sideA),
        m - values for sideA, sideB, and angleAB
     */
    public Triangle(double value1, double value2, double value3,char option) throws IllegalArgumentException{
        if(value1 <= 0.0 || value2 <= 0.0 || value3 <= 0.0)
            throw new IllegalArgumentException("All values must be positive number!");
        switch(option){
            case 's':
                if( !( (sideA < sideB+sideC) && (sideB < sideA+sideC)) && (sideC < sideB+sideA) )
                    throw new IllegalArgumentException("Wrong values of triangle sides!");
                sideA = value1;
                sideB = value2;
                sideC = value3;
                angleAB = calculateAngleFromCosinesLaw(sideA,sideB,sideC);
                angleBC = calculateAngleFromCosinesLaw(sideB,sideA,sideC);
                angleAC = calculateAngleFromCosinesLaw(sideC,sideA,sideB);
                break;
            case 'a':
                angleAB = value1; // alfa
                angleAC = value2; // beta
                sideA = value3;
                angleBC = 180.0 - angleAB - angleAC;
                sideB = calculateSideFromSinesLaw(sideA,angleAB,angleBC);
                sideC = calculateSideFromSinesLaw(sideA,angleAB,angleAC);
                break;
            case 'm':
                sideA = value1;
                sideB = value2;
                angleAB = value3;
                sideC = calculateSideFromCosinesLaw(sideA,sideB,angleAB);
                angleBC = calculateAngleFromCosinesLaw(sideB,sideA,sideC);
                angleAC = calculateAngleFromCosinesLaw(sideC,sideA,sideB);
                break;
            default:
                throw new IllegalArgumentException("wrong option! Should use another char: " +
                        "\ns - sides, a - angles, m - mix(2 sides and angle between)");
        }
    }
    // angle is angle between side 1 and side 2
    public static double calculateSideFromCosinesLaw(double side1, double side2, double angle){
        return Math.sqrt(Math.pow(side1,2.0) + Math.pow(side2,2.0) - 2.0*side1*side2*Math.cos(angle));
    }

    // angle is angle between side 1 and side 2
    public static double calculateAngleFromCosinesLaw(double side1, double side2, double side3){
        return Math.acos((Math.pow(side1,2.0) + Math.pow(side2,2.0) - Math.pow(side2,2.0))/(2.0*side1*side2));
    }

    // side1, angle1 (for example a and alfa), angle2 return side 2 (for example beta and side b)
    public static double calculateSideFromSinesLaw(double side1, double angle1, double angle2){
        return (Math.sin(angle2)*side1)/Math.sin(angle1);
    }


    @Override
    public double calculateArea() {
        return 0.5*sideA*sideB*Math.sin(angleAB);
    }

    @Override
    public double calculatePerimeter() {
        return sideA+sideB+sideC;
    }


    @Override
    public void print() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return "Figure: Triangle" +
                "\nSides: a= "+sideA+", b= "+sideB+", c= "+sideC+
                "\nAngles : alfa= "+angleAB+", beta= "+angleBC+", gamma= "+angleAC+
                "\nArea: "+calculateArea()+
                "\nPerimeter: "+calculatePerimeter();
    }


}
