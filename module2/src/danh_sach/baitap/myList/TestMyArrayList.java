package danh_sach.baitap.myList;

public class TestMyArrayList {
    public static class  Student{
        private int id;
        private  String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public  Student (){

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
    public static void main(String[] args) {
        Student a = new Student(1,"ly");
        Student b = new Student(2,"ly");
        Student c = new Student(3,"ly");
        Student d = new Student(4,"ly");
        Student e = new Student(5,"ly");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        for (int i=0;i< studentMyArrayList.size();i++){
            Student student =(Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }
}
