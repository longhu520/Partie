/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manips;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PaulPark
 */
public class PartieTest {
    
    public PartieTest() {
    }

    @Test
    public void coorper(){
        Partie instance = new Partie();
        instance.cooperer(true, true);
        int nb = instance.getNbCoups();
        int scoreA = instance.getCoup().getGainA();
        int scoreB = instance.getCoup().getGainB();
        assertEquals(1, nb);
        assertEquals(3, scoreA);
        assertEquals(3, scoreB);
        
        Partie instance1 = new Partie();
        instance1.cooperer(true, false);
        nb = instance1.getNbCoups();
        scoreA = instance1.getCoup().getGainA();
        scoreB = instance1.getCoup().getGainB();
        assertEquals(1, nb);
        assertEquals(0, scoreA);
        assertEquals(5, scoreB);
        
        Partie instance2 = new Partie();
        instance2.cooperer(false, true);
        nb = instance2.getNbCoups();
        scoreA = instance2.getCoup().getGainA();
        scoreB = instance2.getCoup().getGainB();
        assertEquals(1, nb);
        assertEquals(5, scoreA);
        assertEquals(0, scoreB);
        
        Partie instance3 = new Partie();
        instance3.cooperer(false, false);
        nb = instance3.getNbCoups();
        scoreA = instance3.getCoup().getGainA();
        scoreB = instance3.getCoup().getGainB();
        assertEquals(1, nb);
        assertEquals(1, scoreA);
        assertEquals(1, scoreB);
    }

    @Test
    public void testGetNbCoups() {
        Partie instance = new Partie();
        int expResult = 0;
        int result = instance.getNbCoups();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetScoreA() {
        Partie instance = new Partie();
        int expResult = 0;
        int result = (int)(instance.getScoreA());
        assertEquals(expResult, result);
    }

    @Test
    public void testGetScoreB() {
        Partie instance = new Partie();
        int expResult = 0;
        int result = (int)(instance.getScoreB());
        assertEquals(expResult, result);
    }
    
}
