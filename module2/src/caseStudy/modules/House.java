package caseStudy.modules;

public class House extends Facility {
    private String roomStandard;
    private int numbersFloors;
    public House(){

    }
    public House(String roomStandard, int numbersFloors) {
        this.roomStandard = roomStandard;
        this.numbersFloors = numbersFloors;
    }

    public House(String id,String serviceName, double area, double cost, int quantity, String rentalType, String roomStandard, int numbersFloors) {
        super(id,serviceName, area, cost, quantity, rentalType);
        this.roomStandard = roomStandard;
        this.numbersFloors = numbersFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumbersFloors() {
        return numbersFloors;
    }

    public void setNumbersFloors(int numbersFloors) {
        this.numbersFloors = numbersFloors;
    }
}
