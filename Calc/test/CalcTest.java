/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 24
 */
public class CalcTest {
    
    public CalcTest() {
    }
    @Test
    public void testAdd() {
      int result = Calc.add(2,3); 
       assertEquals(5, result);
    }
    
    @Test
   public void testsubstract() {
      int result = Calc.substract(2,3); 
       assertEquals(-1, result);
     }
   @Test
   public void testMultiply() {
      int result = Calc.multiply(2,3); 
       assertEquals(6, result);
   }
   
   @Test
   public void testDivide() {
      int result = Calc.Divide(6,3); 
       assertEquals(2, result);
   }
   @Test
    public void testSquareRoot() {
      double result = Calc.SquareRoot(25); 
       assertEquals(5.0, result, 0.0);
   }
     @Test
    public void testPower() {
      double result = Calc.Power(3,2); 
       assertEquals(9.0, result, 0.0);
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
