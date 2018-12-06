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
public class Gate {

    private boolean isGateUp=false;
    private Indicator indicator;

    Gate(boolean p_isGateUp,Indicator indicator) {
        isGateUp = p_isGateUp;
        this.indicator=indicator;
    }

    synchronized void pass()
            throws InterruptedException {

        while (isGateUp) {
            wait();
        }
        System.out.println("gate passed.");

    }

    synchronized void raise() throws InterruptedException {
        isGateUp = false;
        System.out.println("gate raised.");
        notifyAll();
    }

    synchronized void lower() throws InterruptedException {
        isGateUp = true;
        System.out.println("gate lowered.");
    }
}
