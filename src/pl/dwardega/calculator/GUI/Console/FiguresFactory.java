package pl.dwardega.calculator.GUI.Console;

import pl.dwardega.calculator.figures.Circle;
import pl.dwardega.calculator.figures.Rectangle;
import pl.dwardega.calculator.figures.Square;

import java.util.Scanner;

public class FiguresFactory {

    private static Scanner scanner = new Scanner(System.in);

    public static Square makeSquare(){
        Menu.clearScreen();
        System.out.println("--- Making square:\n" +
                "-> Input length of side");
        double side = scanner.hasNextDouble() ? scanner.nextDouble() : -1.0;
        Square square = new Square(side);
        System.out.println("-> The square is made correctly");
        square.print();
        return square;
    }

    public static Rectangle makeRectangle(){
        Menu.clearScreen();
        System.out.println("--- Making rectangle:\n" +
                "-> Input height of side");
        double height = scanner.hasNextDouble() ? scanner.nextDouble() : -1.0;
        System.out.println("-> Input width of side");
        double width = scanner.hasNextDouble() ? scanner.nextDouble() : -1.0;
        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("-> The rectangle is made correctly");
        rectangle.print();
        return rectangle;
    }

    public static Circle makeCircle(){
        Menu.clearScreen();
        System.out.println("--- Making Circle:\n" +
                "-> Input radius");
        double radius = scanner.hasNextDouble() ? scanner.nextDouble() : -1.0;

        Circle circle = new Circle(radius);
        System.out.println("-> The circle is made correctly");
        circle.print();
        return circle;
    }
}
