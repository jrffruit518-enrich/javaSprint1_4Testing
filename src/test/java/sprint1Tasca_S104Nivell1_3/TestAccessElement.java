package sprint1Tasca_S104Nivell1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * ClassName: AccessTest
 * Package: spring1Tasca_S104Nivell1_3
 * Description:
 * Author: Rong Jiang
 * Create:11/10/2025 - 15:03
 * Version:v1.0
 */
public class TestAccessElement {
    @Test
    public void test() {
        int[] arr = {15, 25, 36, 14};
        int index = 5;
        int index1 = -2;
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> AccessElement.accessElement(arr, index));
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> AccessElement.accessElement(arr, index1));
    }
}
