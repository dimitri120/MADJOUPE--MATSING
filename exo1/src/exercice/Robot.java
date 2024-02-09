/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

/**
 *
 * @author MK LITE
 */
public class Robot {
        private String nom;
    private int pointsDeVie;
//declarration des varriable 
    public Robot(String nom) {
        this.nom = nom;
        this.pointsDeVie = 10;
    }

    public void fire(Robot cible) {
        cible.perdreVie(2);
        System.out.println("Robot " + cible.getNom() + " a été touché par le Robot " + this.nom + " !");
    }

    public boolean isDead() {
        return pointsDeVie <= 0;
    }

    public void perdreVie(int points) {
        pointsDeVie -= points;
        if (pointsDeVie < 0) {
            pointsDeVie = 0;
        }
    }

    public String getNom() {
        return nom;
    }
     public int getPoint() {
        return pointsDeVie;
    }

    @Override
    public String toString() {
        return "Robot " + nom;
    }
}
