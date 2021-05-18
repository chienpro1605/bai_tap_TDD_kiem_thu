import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    @org.junit.jupiter.api.Test
    void finAbsolute() {
        int number = 0;
        int expected = 0;

        int result = Calculate.findAbsolute(number);
        assertEquals(expected, result);
    }
}