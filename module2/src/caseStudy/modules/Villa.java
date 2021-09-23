package caseStudy.modules;

public class Villa extends Facility{
    private String roomStandard;
    private double areaPool;
    private int numberRoom;
    public Villa(){

    }
    public Villa(String roomStandard, double areaPool, int numberRoom) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberRoom= numberRoom;
    }

    public Villa(String id,String serviceName, double area, double cost, int quantity, String rentalType, String roomStandard, double areaPool, int numberRoom) {
        super(id,serviceName, area, cost, quantity, rentalType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberRoom=numberRoom;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ",numberRoom= "+numberRoom+
                '}';
    }
}
