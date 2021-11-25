package ExceptionAndDebug.IllegalTriangleException;

public class CreateTriangle extends IllegalTriangleException {
    private int side1;
    private int side2;
    private int side3;

    public CreateTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }
        } else {
            throw new IllegalTriangleException();
        }
    }
}
