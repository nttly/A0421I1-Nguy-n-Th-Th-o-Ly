package ke_Thua.baitap.point_moveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint.toString());
        System.out.println("MovablePoint move:"+movablePoint.move());
    }
}