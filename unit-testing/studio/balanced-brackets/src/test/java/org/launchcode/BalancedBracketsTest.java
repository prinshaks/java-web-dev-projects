package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void BalancedBracketTest1() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void BalancedBracketTest2() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void BalancedBracketTest3() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void BalancedBracketTest4() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void BalancedBracketTest5() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void BalancedBracketTest6() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void BalancedBracketTest7() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void BalancedBracketTest8() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void BalancedBracketTest9() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void BalancedBracketTest10() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("{}{"));
    }
    @Test
    public void BalancedBracketTest11() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void BalancedBracketTest12() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

}