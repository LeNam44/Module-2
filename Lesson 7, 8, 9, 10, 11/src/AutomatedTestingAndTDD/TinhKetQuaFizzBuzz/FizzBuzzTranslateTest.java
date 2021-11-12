package AutomatedTestingAndTDD.TinhKetQuaFizzBuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzTranslateTest {

    private void assertEqual(String expected, String result) {
    }

    @Test
    void testNumber3() {
        int inputNumber = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber5() {
        int inputNumber = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumberNegative3() {
        int inputNumber = -3;
        String expected = "No FizzBuzz";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber15() {
        int inputNumber = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber1() {
        int inputNumber = 1;
        String expected = "một";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber11() {
        int inputNumber = 11;
        String expected = "một một";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber26() {
        int inputNumber = 26;
        String expected = "hai sáu";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber43() {
        int inputNumber = 43;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }

    @Test
    void testNumber52() {
        int inputNumber = 52;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translateFizzBuzz(inputNumber);
        assertEqual(expected, result);
    }
}
