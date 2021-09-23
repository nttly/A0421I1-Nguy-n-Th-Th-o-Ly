package caseStudy.modules;

public abstract class Facility {
    private String id;
    private String serviceName;
    private double area;
    private double cost;
    private int quantity;
    private String rentalType;

    public Facility() {
    }

    public Facility(String id,String serviceName, double area, double cost, int quantity, String rentalType) {
        this.id=id;
        this.serviceName = serviceName;
        this.area=area;
        this.cost = cost;
        this.quantity = quantity;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
