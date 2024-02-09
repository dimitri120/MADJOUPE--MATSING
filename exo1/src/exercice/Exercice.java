/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;
// creation de la class 
/**
 *
 * @author EMPEREUR STORE
 */
public class Exercice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot d2r2 = new Robot("D2R2");
        Robot data = new Robot("Data");

        Robot vainqueur = Arena.fight(d2r2, data);

        System.out.println("Le vainqueur est : " + vainqueur);
    // TODO code application logic here
    }
    
}


class Arena {
    public static Robot fight(Robot robot1, Robot robot2) {
        while (!robot1.isDead() && !robot2.isDead()) {
            robot1.fire(robot2);
            if (!robot2.isDead()) {
                robot2.fire(robot1);
            }
        }
        if (robot1.isDead()) {
            return robot2;
        } else {
            return robot1;
        }
    }
}

