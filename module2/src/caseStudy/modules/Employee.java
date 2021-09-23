package caseStudy.modules;

public class Employee extends Person {

    private String level;
    private String location;
    private double wage;
    public Employee(){

    }

    public Employee(String level, String location, double wage) {
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(int id, String name, int age, String gender, String cmnd, String phone, String email, String level, String location, double wage) {
        super(id, name, age, gender, cmnd, phone, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString()+
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}
