package sprint1Tasca_S104Nivell1_2;

public class CalculateDNI {

    private static final char[] LETTERS = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
            'C', 'K', 'E'
    };


    public static char calculateLetter(int dniNumber) {
        if (dniNumber < 10000000 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 10000000 and 99999999.");
        }
        int index = dniNumber % 23;
        return LETTERS[index];
    }
}



