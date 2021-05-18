import static org.junit.jupiter.api.Assertions.*;

class PhanLoaiTamGiacTest {

    @org.junit.jupiter.api.Test
    void phanLoai() {
        double a = 3;
        double b = 2;
        double c = 2;

        String expected = "tam giác thường";
        String result = PhanLoaiTamGiac.phanLoai(a,b,c);
        assertEquals(expected,result);
    }
//    @org.junit.jupiter.api.Test
//    void phanLoai1() {
//        double a = 2;
//        double b = 2;
//        double c = 2;
//
//        String expected = "không phải là tam giác";
//        String result = PhanLoaiTamGiac.phanLoai(a,b,c);
//        assertEquals(expected,result);
//    }
//    @org.junit.jupiter.api.Test
//    void phanLoai2() {
//        double a = 3;
//        double b = 2;
//        double c = 2;
//
//        String expected = "không phải là tam giác";
//        String result = PhanLoaiTamGiac.phanLoai(a,b,c);
//        assertEquals(expected,result);
//    }
}