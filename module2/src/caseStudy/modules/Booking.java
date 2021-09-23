package caseStudy.modules;

public class Booking {
    private String idBook;
    private String startDay;
    private String endDay;
    private String id;
    private String serviceName;
    private String typeService;

    public Booking() {
    }

    public Booking(String idBook, String startDay, String endDay, String id, String serviceName, String typeService) {
        this.idBook = idBook;
        this.startDay = startDay;
        this.endDay = endDay;
        this.id = id;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
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

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
}
