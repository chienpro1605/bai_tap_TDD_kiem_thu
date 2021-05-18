import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhNgayTiepTheoTest {

    @Test
    void nextDay() {
        int day =31;
        int month = 1;
        int year = 2018;
        String expected = "next day: 1/2/2018";

        String result = TinhNgayTiepTheo.nextDay(31,1,2018);
        assertEquals(expected, result);

    }
}