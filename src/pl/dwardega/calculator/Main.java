package pl.dwardega.calculator;

import pl.dwardega.calculator.GUI.Console.Menu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu.mainMenu();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ex){}
        System.exit(-1);
    }
}
