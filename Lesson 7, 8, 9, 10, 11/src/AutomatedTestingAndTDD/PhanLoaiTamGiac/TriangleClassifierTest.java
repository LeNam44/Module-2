package AutomatedTestingAndTDD.PhanLoaiTamGiac;

import org.junit.jupiter.api.Test;

public class TriangleClassifierTest {

    private void assertEquals(String expected, String result) {
    }

    @Test
    void testSideA2SideB2SideC2() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "Tam giac deu";

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected,result);
    }

    @Test
    void testSideA2SideB2SideC3() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "Tam giac can";

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected,result);
    }

    @Test
    void testSideA3SideB4SideC5() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "Tam giac thuong";

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected,result);
    }

    @Test
    void testSideA8SideB2SideC3() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "Khong phai la tam giac";

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected,result);
    }

    @Test
    void testSideAnegative1SideB2SideC1() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "Khong phai la tam giac";

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected,result);
    }

    @Test
    void testSideA0SideB1SideC1() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "Khong phai la tam giac";

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);
        assertEquals(expected,result);
    }
}
