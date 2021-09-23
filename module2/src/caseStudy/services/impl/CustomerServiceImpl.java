package caseStudy.services.impl;

import caseStudy.modules.Customer;
import caseStudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner =new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String  name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int  age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính:");
        String  gender = scanner.nextLine();
        System.out.println("Nhập số CMND:");
        String  cmnd = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        String  phone = scanner.nextLine();
        System.out.println("Nhập email:");
        String  email = scanner.nextLine();
        System.out.println("Nhập loại khách:");
        String  typeCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String  address = scanner.nextLine();
        Customer customer = new Customer(id,name,age,gender,cmnd,phone,email,typeCustomer,address);
        customerList.add(customer);

        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        scanner.nextLine();
        System.out.println("Nhập id cần tìm: ");
        int id = scanner.nextInt();
        for (Customer customer: customerList){
            if (customer.getId()==id){
                System.out.println("Nhập thông tin cần sửa : "+ "1. Tên \n 2. Tuổi \n 3. Giới tính \n 4. Số CMND \n 5. Số Điện thoại \n 6. Email \n 7. Loại khách \n 8. Địa chỉ \n");
                switch (scanner.nextInt()){
                    case 1: {
                        scanner.nextLine();
                        System.out.println("Nhập tên cần sửa: ");
                        String name = scanner.nextLine();
                        customer.setName(name);
                        break;
                    }
                    case 2:{

                        System.out.println("Nhập tuổi cần sửa:");
                        int age= scanner.nextInt();
                        customer.setAge(age);
                        break;
                    }
                    case 3: {
                        scanner.nextLine();
                        System.out.println("Nhập giới tính cần sửa:");
                        String gender =  scanner.nextLine();
                        customer.setGender(gender);
                        break;
                    }
                    case 4:{
                        scanner.nextLine();
                        System.out.println("Nhập số CMND cần sửa:");
                        String cmnd = scanner.nextLine();
                        customer.setCmnd(cmnd);
                        break;
                    }
                    case 5: {
                        scanner.nextLine();
                        System.out.println("Nhập số điện thoại cần sửa :");
                        String phone = scanner.nextLine();
                        customer.setPhone(phone);
                        break;
                    }
                    case 6: {
                        scanner.nextLine();
                        System.out.println("Nhập Email cần sửa :");
                        String email = scanner.nextLine();
                        customer.setEmail(email);
                        break;
                    }
                    case 7: {
                        scanner.nextLine();
                        System.out.println("Nhập loại khách cần sửa :");
                        String typeCustomer = scanner.nextLine();
                        customer.setTypeCustomer(typeCustomer);
                        break;
                    }
                    case 8: {
                        scanner.nextLine();
                        System.out.println("Nhập địa chỉ cần sửa :");
                        String address = scanner.nextLine();
                        customer.setAddress(address);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void delete() {

    }
}
