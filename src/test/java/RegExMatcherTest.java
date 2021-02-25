import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExMatcherTest {
    /**
     * ANY EDITS TO THIS TEST CLASS WILL RESULT IN POINT REDUCTION
     */

    RegExMatcher rem;

    @Test
    void isProperName() {
        rem = new RegExMatcher();
        String[] namesT = {"Bob", "James", "Smith", "Joey"};
        String[] namesF = {"b1lly", "Legi0n","800", "fiSh", ""};
        for(String n : namesT){
            assertTrue(rem.isProperName(n));
        }
        for(String n : namesF){
            assertFalse(rem.isProperName(n));
        }
    }

    @Test
    void isInteger() {
        rem = new RegExMatcher();
        String[] numT = {"12", "43.23", "-34.5","+98.7","0", "0.0230"};
        String[] numF = {"023","-0","+3X4","001"};
        for(String n : numT){
            assertTrue(rem.isInteger(n));
        }
        for(String n : numF){
            assertFalse(rem.isInteger(n));
        }
    }

    @Test
    void isAncestor() {
        String[] personT = {"father","mother", "grandmother","grandfather","great-grandmother","great-great-grandfather"};
        String[] personF = {"sister","brother","uncle", "nephew"};
        for(String n : personT){
            assertTrue(rem.isAncestor(n));
        }
        for(String n : personF){
            assertFalse(rem.isAncestor(n));
        }

    }

    @Test
    void isPalindrome() {
        String[] palindrome = {"anna","raceCAR","BoB","kayak","asdfggfdsa"};
        for(String n : palindrome){
            assertTrue(rem.isPalindrome(n));
        }
    }
}