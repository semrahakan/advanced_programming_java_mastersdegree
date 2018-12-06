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
public class Indicator {

    private int numCarsOntheRoad = 0; 

    Indicator() {
    }

    synchronized void increase() {
        numCarsOntheRoad++;

    }

    synchronized void decrease() throws InterruptedException {
        numCarsOntheRoad--;
        Thread.sleep(2000);
    }

    int count() {
        return numCarsOntheRoad;
    }
}
