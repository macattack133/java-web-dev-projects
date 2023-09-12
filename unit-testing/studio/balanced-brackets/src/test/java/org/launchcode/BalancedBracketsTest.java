package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void multipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void multipleUnbalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]["));
    }
    @Test
    public void notNull() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void equals() {
        boolean expected = BalancedBrackets.hasBalancedBrackets("");
        boolean actual = BalancedBrackets.hasBalancedBrackets("[]");
        assertEquals(expected,actual);
    }

}


