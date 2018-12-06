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
public class Car implements Runnable {

    private int carID;
    private Gate gate;
    private Indicator indicator;

    Car(int id, Gate gate, Indicator indicator) {
        this.carID = id;
        this.gate = gate;
        this.indicator = indicator;
    }

    private void pass() {
        System.out.println("car " + carID + " trying to pass the gate");
    }

    private void enterRoad() {
        System.out.println("car " + carID + " enters the road.");
    }

    private void exitRoad() {
        System.out.println("car " + carID + " exits the road.");
    }

    public void run() {
        while (true) {
            try {
                pass();
                gate.pass();
                enterRoad();
                indicator.increase();
                exitRoad();
                indicator.decrease();
            } catch (Exception e) {
                System.out.println(e.getMessage().toString());
            }
        }
    }

}
