package sprint1Tasca_S104Nivell1_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculateTest {

    @ParameterizedTest
    @CsvSource({
            "12345678,Z",
            "15325896,F",
            "11111111,H",
            "35264578,N",
            "33333333,P",
            "45285689,T",
            "55555555,K",
            "66666666,Q",
            "77777777,B",
            "88888888,Y"
    })
    void testCalculateLetter(int dniNumber, char expectedLetter) {
        char result = CalculateDNI.calculateLetter(dniNumber);
        assertEquals(expectedLetter, result);
    }

}
