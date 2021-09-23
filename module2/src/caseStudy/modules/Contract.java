package caseStudy.modules;

public class Contract {
    private String idContract;
    private String idBook;
    private double moneyDeposit;
    private double moneyPay;
    private String id;
    public Contract(){

    }
    public Contract(String idContract, String idBook, double moneyDeposit, double moneyPay, String id) {
        this.idContract = idContract;
        this.idBook = idBook;
        this.moneyDeposit = moneyDeposit;
        this.moneyPay = moneyPay;
        this.id = id;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public double getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(double moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public double getMoneyPay() {
        return moneyPay;
    }

    public void setMoneyPay(double moneyPay) {
        this.moneyPay = moneyPay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
