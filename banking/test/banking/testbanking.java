/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import banking.bank;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MY PC
 */
public class testbanking {
    
    bank b1;
     
    
    public testbanking() {
        float amount = 1000;
        this.b1 = new bank(amount);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
     public void testdeposit(){
         assertEquals(1100,b1.deposit(100));
         assertEquals(2100,b1.deposit(1000));
         assertEquals(3600,b1.deposit(1500));
         
     }

    
    @Test
     public void testwithdraw(){
         assertEquals(900,b1.withdraw(100));
         assertEquals(400,b1.withdraw(500));
         
         
     }
}
