package lop_va_doi_tuong_trong_java.baitap.lop_hinh_chu_nhat;

public class Lop_hinh_Chu_Nhat {
    double width, height;

    public Lop_hinh_Chu_Nhat() {
    }

    public Lop_hinh_Chu_Nhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{"+"width = "+width+", height = "+height+"}";

    }
}
