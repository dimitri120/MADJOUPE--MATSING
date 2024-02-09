/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice2;
import java.util.Random;
/**
 *
 * @author EMPEREUR STORE
 */
public class Exercice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robot1", 100);
        Robot robot2 = new Robot("Robot2", 100);

        System.out.println(robot1);
        System.out.println(robot2);

        robot1.fire(robot2);

        Fighter fighter1 = new Fighter("Fighter1", 100, 123);
        Fighter fighter2 = new Fighter("Fighter2", 100, 456);

        System.out.println(fighter1);
        System.out.println(fighter2);

        fighter1.fire(robot1);
        fighter2.fire(robot1); // TODO code application logic here
    }
    
}


class Robot {
    protected String name;
    protected int healthPoints;

    public Robot(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints <= 0) {
            System.out.println(name + " is destroyed!");
        }
    }

    public void fire(Robot target) {
        if (target.healthPoints > 0) {
            System.out.println(name + " fires at " + target.name);
            target.takeDamage(10);
        } else {
            System.out.println("Cannot fire at a destroyed target!");
        }
    }

    public String toString() {
        return "Robot: " + name;
    }
}

class Fighter extends Robot {
    private Random random;

    public Fighter(String name, int healthPoints, long seed) {
        super(name, healthPoints);
        random = new Random(seed);
    }

    @Override
    public void fire(Robot target) {
        if (random.nextBoolean()) {
            super.fire(target);
        } else {
            System.out.println(name + " misses the shot!");
        }
    }

    @Override
    public String toString() {
        return "Fighter: " + name;
    }
}


