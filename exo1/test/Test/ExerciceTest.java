package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercice.Robot;
import exercice.Robot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MK LITE
 */
public class ExerciceTest {
    
    public ExerciceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void CreationRobotTest() {
         Robot rob1 = new Robot("Bob");
         Robot rob2 = new Robot("god");
         assertEquals("Bob", rob1.getNom());
         
    }
     
        @Test
     public void FireTest() {
         Robot rob1 = new Robot("Bob");
         Robot rob2 = new Robot("god");
         rob1.fire(rob2);
         assertTrue(rob2.getPoint() < 10);
         
    }
    // public void hello() {}
}
