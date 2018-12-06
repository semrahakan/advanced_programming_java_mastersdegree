/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safemartin;

/**
 *
 * @author Halil and Semra
 */
import java.io.*;

public class SAFEMARTIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BufferedReader br;
        int selectedOption;
        showMainMenu();
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            selectedOption = Integer.parseInt(br.readLine());
            switch (selectedOption) {
                case 1:
                    Controller c = new Controller();
                    c.run();
                    break;
                case 2:
                    System.exit(1);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.exit(1);
        }

    }

    public static void showMainMenu() {
        System.out.println("");
        System.out.println("Menu");
        System.out.println("---------------------------");
        System.out.println("1. Start SAFE MARTIN application");
        System.out.println("");
        System.out.println("2. Exit");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.print("Please select an option from 1-2");
        System.out.println("");
        System.out.println("");
    }

}
