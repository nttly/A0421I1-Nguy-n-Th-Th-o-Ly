package lop_va_doi_tuong_trong_java.baitap.fan;

public class Fan {
    public static final int SLOW =1 ;
    public static final int MEDIUM=3;
    public static final int FAST =3;
    private int speed = SLOW;
    private boolean on =false;
    private double radius =5;
    private String color="blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getToString(){
        if (this.isOn()){
            return "speed: "+speed+"; color : "+color+" ;radius: "+radius+"; fan is on";
        } else {
            return "color : "+color+" ;radius: "+radius+"; fan is of";

        }
    }
}
