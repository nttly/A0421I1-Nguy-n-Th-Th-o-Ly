package suLyNgoaiLe_Debug.baitap.suDungLop_IllegalTriangleException;

public class Test {
    public static void main(String[] args) throws IllegalTringleException {
        Triangle tringle = new Triangle(-1, 2, 3);
        if (tringle.getA() < 0 || tringle.getB() < 0 || tringle.getC() < 0 || tringle.getA() + tringle.getB() < tringle.getC() || tringle.getC() + tringle.getA() < tringle.getB() || tringle.getB() + tringle.getC() < tringle.getA()) {
            throw new IllegalTringleException();
        }
    }
}
