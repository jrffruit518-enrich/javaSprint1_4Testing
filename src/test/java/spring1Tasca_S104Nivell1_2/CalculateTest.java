package spring1Tasca_S104Nivell1_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


public class CalculateTest {

    private final int dniNumber;
    private final char expectedLetter;

    public CalculateTest(int dniNumber, char expectedLetter) {
        this.dniNumber = dniNumber;
        this.expectedLetter = expectedLetter;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {12345678, 'Z'},
                {87654321, 'X'},
                {11111111, 'H'},
                {22222222, 'J'},
                {33333333, 'P'},
                {44444444, 'A'},
                {55555555, 'K'},
                {66666666, 'Q'},
                {77777777, 'B'},
                {88888888, 'Y'}
        });
    }

    @Test
    public void testCalculateLetter() {
        assertEquals(expectedLetter, CalculateDNI.calculateLetter(dniNumber));
        System.out.println("The test is successful.");
    }



}
