package pl.dwardega.calculator.GUI.Console;

import java.util.Scanner;

public class MainMenu extends Menu {

    public static void menu(){
        clearScreen();
        Scanner optionChooser = new Scanner(System.in);

        // this condition is changed when user want to exit menu
        // (it's breaking the while loop)
        boolean stillWorking = true;

        while(stillWorking){
            System.out.println(mainMenuStatement());
            int option = optionChooser.hasNextInt() ? optionChooser.nextInt():-1;
            System.out.println("test");
            switch (option) {
                case 1:
                    // menu for figures
                    clearScreen();
                    FigureMenu.menu();
                    break;
                case 2:
                    // menu for prism
                    clearScreen();
                    //PrismMenu.menu();
                    break;
                case 0:
                    clearScreen();
                    System.out.println(quitStatement());
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



    private static String  mainMenuStatement(){
        return "--- GEOMETRIC CALCULATOR ---"+
                "\nChoose category: " +
                "\n1. Flat figures" +
                "\n2. Spatial figures" +
                "\n0. QUIT" +
                "\n[Input correct number]";
    }

    private static String quitStatement(){
        return "Thanks for working. Bye bye :)";
    }
}
