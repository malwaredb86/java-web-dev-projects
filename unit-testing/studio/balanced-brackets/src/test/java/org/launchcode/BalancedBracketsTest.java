package org.launchcode;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringBracket(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void nestedBracketsMatched(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    @Test
    public void endBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode[]"));
    }

    @Test
    public void startBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }

    @Test
    public void outsideWrappingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void insideWrappingReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]code"));
    }

    @Test
    public void middleWrappingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void onlyOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void backwardsBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpenOutsideWrapping(){
        assertFalse((BalancedBrackets.hasBalancedBrackets("[Launchcode")));
    }

    @Test
    public void onlyCloseOutsideWrapping(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode]"));
    }

    @Test
    public void backwardsMiddleWrapping(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code["));
    }

    @Test
    public void nestedBracketsUnmatched(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }





}