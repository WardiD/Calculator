package pl.dwardega.calculator.figures;

import static org.junit.jupiter.api.Assertions.*;
// TO DO
class TriangleTest {

    private Triangle triangle;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("making triangle");
        triangle = new Triangle(5.0,4.0,30.0,'m');
        triangle.print();
    }


    @org.junit.jupiter.api.Test
    //3S - 3 sides option
    public void testCreate3STriangle(){
        Triangle triangle = new Triangle(3.0,4.0,5.0,'s');
        assertTrue(triangle instanceof Triangle);
    }

    @org.junit.jupiter.api.Test
    public void CreateTriangleIllegalArgumentException(){
        // one argument is negative number
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(-1.0,1.0,3.0,'s');
        });
        // all arguments are negative numbers
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(-1.0,-2.0,-3.0,'s');
        });
    }

    @org.junit.jupiter.api.Test
    public void CreateTriangleWithWrongOptionException(){
        // other character than allowed ones
        assertThrows(IllegalArgumentException.class, () -> {
            Triangle triangle = new Triangle(-1.0,-2.0,-3.0,'z');
        });
    }

    @org.junit.jupiter.api.Test
    public void TestCalculateSideFromCosinesLaw(){
        assertEquals(Triangle.calculateSideFromCosinesLaw(5.0,4.0,30.0),Math.sqrt(13));
    }




}