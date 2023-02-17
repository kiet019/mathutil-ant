/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kiet.mathutil.test.core;

import org.junit.Assert;
import org.junit.Test;
import com.kiet.mathutil.core.MathUtility;
/**
 *
 * @author kietl
 */
public class MathUtilityTest {

    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsRexception() {
        MathUtility.getFactorial(-5);
        
    }

    @Test
    public void testRedGreenSignal() {
            Assert.assertEquals(6789, 6789);
    }
    
    @Test
    public void testFactorialGivenRightArguementReturnWell() {
        //case 1: n = 0
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        Assert.assertEquals(expectedValue, actualValue);
        
        //case 2; n = 1    
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        
        //case 3; n = 2    
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        
        //case 4; n = 6
        Assert.assertEquals(720, MathUtility.getFactorial(6));
    }
    //DDT - DATA DRIVEN TESTING
    
}


