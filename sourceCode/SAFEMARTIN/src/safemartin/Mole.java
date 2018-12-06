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
public class Mole implements Runnable {

    private String name;
    private Gate gate;
    private Indicator indicator;

    Mole(String name, Gate gate, Indicator indicator) {

        this.name = name;
        this.gate = gate;
        this.indicator = indicator;
    }

    private void exitHouse() {
        System.out.println(name + " exits his house");
    }

    private void enterRoad() {
        System.out.println("---------------------------------------");
        System.out.println(name + " enters road.");
        System.out.println("---------------------------------------");
    }

    private void exitRoad() {
        System.out.println("---------------------------------------");
        System.out.println(name + " exits road.");
        System.out.println("---------------------------------------");
    }

    public void run() {
        try {
            while (true) {
                this.exitHouse();
                if (indicator.count() == 0) {
                    System.out.println("---------------------------------------");
                    System.out.println("Indicator OFF: Road is clear.");
                    System.out.println("---------------------------------------");
                    gate.lower();
                    this.enterRoad();
                    this.exitRoad();
                    gate.raise();
                    Thread.sleep(2000);
                } else {
                    System.out.println("Indicator ON: Car(s) on the road.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }

}
