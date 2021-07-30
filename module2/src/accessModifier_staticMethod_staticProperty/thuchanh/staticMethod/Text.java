package accessModifier_staticMethod_staticProperty.thuchanh.staticMethod;

public class Text {
    public static void main(String[] args) {
        Student.change();
        Student s1 =new Student(111,"Nguyễn");
        Student s2 =new Student(222,"Thảo");
        Student s3 = new Student(333,"Ly");
        s1.display();
        s2.display();
        s3.display();
    }
}
