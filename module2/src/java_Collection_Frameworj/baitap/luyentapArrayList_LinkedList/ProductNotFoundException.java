package java_Collection_Frameworj.baitap.luyentapArrayList_LinkedList;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
    public ProductNotFoundException(){
        super("Khong tim thay san pham");
    }
}
