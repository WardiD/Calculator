package pl.dwardega.calculator.GUI.Console;

public abstract class Menu {

    protected static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    protected static String wrongChoiceStatement(){
        return "\nWrong choice! Please try again!\n";
    }

    protected static String backStatement(){
        return "\nReturn to previous menu\n";
    }

}
