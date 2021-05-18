import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void checked() {
       int a = 47;
       String expected = "bonbay";
       String result = FizzBuzz.chuyenThanhChu(a);
       assertEquals(expected,result);
    }
}