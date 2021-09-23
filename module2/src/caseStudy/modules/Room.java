package caseStudy.modules;

public class Room extends Facility {
   private String freeServices;
    public Room(){

    }
    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String id,String serviceName, double area, double cost, int quantity, String rentalType, String freeServices) {
        super(id,serviceName, area, cost, quantity, rentalType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }
}
