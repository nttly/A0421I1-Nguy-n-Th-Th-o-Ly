package java_Collection_Frameworj.baitap.luyentapArrayList_LinkedList;
import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;
    static {
        productList = new ArrayList<>();
    }
    public static void displayMenu(){
        int choice = 0;
        while (true){
            System.out.println("Vui lòng chọn: "+
            "\n 1. Hien thi "+
            "\n 2. Them moi"+
            "\n 3. Xoa"+
            "\n 4. Sua"+
            "\n 5. Thoat");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
    private static void displayProduct(){
        for (Product product : productList){
            System.out.println(product);
        }
    }
    private static void addProduct(){
        int id = -1;
        if (productList.isEmpty()){
            id=1;
        }else {
            id=productList.get(productList.size()-1).getId()+1;
        }
        System.out.println("vui long nhap gia");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Vui long nhap ten");
        String name = scanner.nextLine();
        productList.add(new Product(id,name,price));
    }
    private static void deleteProduct(){
        try {
            System.out.println("nhập id cua san pham muon xoa:");
            int id = Integer.parseInt(scanner.nextLine());
            Product product = findById(id);
            System.out.println("Ban co chac chan muon xoa san pham "+product.getName()+
                    "\n Co"+
                    "\n Khong");
            if (scanner.nextLine().equals("Co")){
                productList.remove(product);
            }
            else {
                displayMenu();
            }
        }
        catch (ProductNotFoundException e){
            e.printStackTrace();
        }
    }
    private static Product findById(int id) throws  ProductNotFoundException{
        Product product = null;
        for (int i=0;i< productList.size();i++){
            if (productList.get(i).getId()== id){
                product = productList.get(i);
            }
        }
        if (product == null){
            throw new ProductNotFoundException("Khong co gi");
        }
        return product;
    }
}
