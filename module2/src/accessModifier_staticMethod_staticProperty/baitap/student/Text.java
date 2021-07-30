package accessModifier_staticMethod_staticProperty.baitap.student;

public class Text {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Ly", "A04121");
        Student student2 = new Student("Thuận", "A04121");
        student.display();
        student1.display();
        student2.display();
    }
}