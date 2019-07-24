package pl.dwardega.calculator.GUI.Console;

import pl.dwardega.calculator.figures.Figure;
import pl.dwardega.calculator.figures.Square;

import java.util.Scanner;

public class FigureMenu extends Menu {

    private static Figure figure;

    public static void menu(){
        clearScreen();

        Scanner optionChooser = new Scanner(System.in);

        // this condition is changed when user want to return to previous menu
        // (it's breaking the while loop)
        boolean stillWorking = true;

        while(stillWorking){
            System.out.println(figureMenuStatement());
            int option = optionChooser.hasNextInt() ? optionChooser.nextInt():-1;
            switch (option) {
                case 1: // Square
                    clearScreen();
                    FiguresFactory.makeSquare();
                    break;
                case 2: // Rectangle
                    clearScreen();
                    FiguresFactory.makeRectangle();
                    break;
                case 3: // Triangle
                    clearScreen();
                    // TO DO
                    break;
                case 4: // Circle
                    clearScreen();
                    FiguresFactory.makeCircle();
                    break;
                case 0:
                    clearScreen();
                    System.out.println(backStatement());
                    stillWorking = false;
                    break;
                default:
                    clearScreen();
                    System.out.println(wrongChoiceStatement());
                    // ??? working correctly with that
                    optionChooser.nextLine();
                    break;
            }
        }
    }

    private static String figureMenuStatement(){
        return "--- FIGURES MENU ---"+
                "\nChoose category: " +
                "\n1. Square" +
                "\n2. Rectangle" +
                "\n3. Triangle" +
                "\n4. Circle" +
                "\n0. BACK" +
                "\n[Input correct number]";
    }

    public static Figure getFigure(){
        return figure;
    }

}
