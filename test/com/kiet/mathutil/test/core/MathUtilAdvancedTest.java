/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.kiet.mathutil.test.core;

import com.kiet.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author kietl
 */
@RunWith(value = Parameterized.class)
public class MathUtilAdvancedTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        int[] a = {5,10,15,20};
        
        return new Object[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {5,120}
        };
    }
    
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testFactorialGivenRightArgumentRunsWell() {
            assertEquals(expected, MathUtility.getFactorial(n));
    }

    
}
