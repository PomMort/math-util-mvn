
package com.giahuy.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MathUtilityTest {
    // TEST CASE TEMPLATE/STRUCTURE:
    // ID | DESC | STEPS|PROCEDURES | EXPECTED VALUE | STATUS (PASSED/FAILED)

    // Test case 1: Verify the getFactorial() function with n = 0
    // Steps/Procedures:
    //                      1. Given  n = 0
    //                      2. Call/invoke getFactorial(int n)
    // Expected Result
    //                  The method getFactorial(n = 0) must return 1
    //                              as the result of 0! == 1
    // STATUS: PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/MEDTHOD
    @Test// dinh' dang' den FRAMWORK thuat ngu~
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //Test case 2: .... n = 1
    @Test// dinh' dang' den FRAMWORK thuat ngu~
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    // Test case 3: ... n = 6
    @Test// dinh' dang' den FRAMWORK thuat ngu~
    public void verifyFactorialGivenRightArgument3ReturnsOk() {
        assertEquals(720, MathUtility.getFactorial(6));
    }
}
