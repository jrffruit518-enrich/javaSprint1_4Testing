package spring1Tasca_S104Nivell1_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;


public class CalculateTest {

    private final int dniNumber;
    private final char expectedLetter;

    public CalculateTest(int dniNumber, char expectedLetter) {
        this.dniNumber = dniNumber;
        this.expectedLetter = expectedLetter;
    }


    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, A",
            "11111111, B"
    })
    void testCalculateLetter(int dniNumber, char expectedLetter) {
        CalculateDNI calculateDNI = new CalculateDNI();
        char result = calculateDNI.calculateLetter(dniNumber);
        assertEquals(expectedLetter, result);
    }

}
