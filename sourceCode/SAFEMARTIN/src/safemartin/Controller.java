/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
* multiple threads example : http://stackoverflow.com/questions/9874587/how-to-create-threads-dynamically

 */
package safemartin;

/**
 *
 * @author Halil and Semra
 */
public class Controller {

    private Mole mole;
    private Car car;
    private int maxAllwdCarsOnRoad = 2;

    Controller() {

    }

    void run() {
        Indicator indicator = new Indicator();
        Gate gate = new Gate(false, indicator);

         mole = new Mole("Martin", gate, indicator);
        Thread martin = new Thread(mole);
        //martin.setPriority(Thread.MAX_PRIORITY);
        martin.start();
        
        
        Thread[] threads = new Thread[maxAllwdCarsOnRoad];
        for (int i = 0; i < threads.length; i++) {
            car = new Car(i, gate, indicator);
            threads[i] = new Thread(car);
            //threads[i].setPriority(Thread.MAX_PRIORITY);
            threads[i].start();
        }

    }

}
