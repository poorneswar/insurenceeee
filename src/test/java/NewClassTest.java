/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class NewClassTest {
    
    public NewClassTest() {
    }

  

    @org.junit.jupiter.api.Test
    public void testLifeInsurance() {
        System.out.println("LifeInsurance");
        int age = 24;
        int expResult = 420;
        int result = NewClass.LifeInsurance(age);
        assertEquals(expResult, result);
    }
    
}
