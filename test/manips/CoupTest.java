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
public class CoupTest {
    
    public CoupTest() {
    }

    @Test
    public void testGetGainA() {
        Coup coup = new Coup(true, true);
        int result = coup.getGainA();
        assertEquals(3, result);
    }

    @Test
    public void testGetGainB() {
        Coup coup = new Coup(false, true);
        int result = coup.getGainB();
        assertEquals(0, result);
    }

    @Test
    public void testGetACoopere() {
        Coup coup = new Coup(false,true);
        boolean expResult = false;
        boolean result = coup.getACoopere();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBCoopere() {
        Coup coup = new Coup(true,false);
        boolean expResult = false;
        boolean result = coup.getBCoopere();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAString() {
        Coup coup = new Coup(true, true);
        String expResult = "C";
        String result = coup.getAString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBString() {
        Coup coup = new Coup(true, false);
        String expResult = "D";
        String result = coup.getBString();
        assertEquals(expResult, result);
    }
    
}
