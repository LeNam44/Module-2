package AutomatedTestingAndTDD.PhanLoaiTamGiac;

public class TriangleClassifier {
    public static String classifyTriangle(int sideA, int sideB, int sideC) {
        boolean isTriangle = sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
        boolean isEquilateralTriangle = sideA == sideB && sideB == sideC;
        boolean isIsoscelesTriangle = sideA == sideB || sideA == sideC || sideB == sideC;
        if (isTriangle) {
            if (isEquilateralTriangle) {
                return "Tam giac deu";
            } else if (isIsoscelesTriangle) {
                return "Tam giac can";
            }
        } else {
            return "Khong phai la tam giac";
        }
        return "Tam giac thuong";
    }

}
