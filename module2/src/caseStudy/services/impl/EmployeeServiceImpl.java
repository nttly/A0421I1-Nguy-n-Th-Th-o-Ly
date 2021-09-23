package caseStudy.services.impl;
import caseStudy.modules.Employee;
import caseStudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl  implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
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
        System.out.println("Nhập trình độ:");
        String  level = scanner.nextLine();
        System.out.println("Nhập vị trí:");
        String  location = scanner.nextLine();
        System.out.println("Nhập lương:");
        double  wage = scanner.nextDouble();
        Employee employee = new Employee(id,name,age,gender,cmnd,phone,email,level,location,wage);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id cần tìm :" );
        scanner.nextInt();
        int id = scanner.nextInt();
        for (Employee employee: employeeList){
            if (employee.getId()==id){
                System.out.println("Nhập thông tin cần sửa: \n" +
                        "1. Tên \n 2. Tuổi \n 3. Giới tính \n 4. Số CMND \n 5. Số Điện thoại \n 6. Email \n 7. Trình độ \n 8. Vị trí \n 9.Lương");
                    switch (scanner.nextInt()){
                    case 1: {
                        scanner.nextLine();
                        System.out.println("Nhập tên cần sửa: ");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    }
                    case 2:{

                        System.out.println("Nhập tuổi cần sửa:");
                        int age= scanner.nextInt();
                        employee.setAge(age);
                        break;
                    }
                    case 3: {
                        scanner.nextLine();
                        System.out.println("Nhập giới tính cần sửa:");
                        String gender =  scanner.nextLine();
                        employee.setGender(gender);
                        break;
                    }
                    case 4:{
                        scanner.nextLine();
                        System.out.println("Nhập số CMND cần sửa:");
                        String cmnd = scanner.nextLine();
                        employee.setCmnd(cmnd);
                        break;
                    }
                    case 5: {
                        scanner.nextLine();
                        System.out.println("Nhập số điện thoại cần sửa :");
                        String phone = scanner.nextLine();
                        employee.setPhone(phone);
                        break;
                    }
                    case 6: {
                        scanner.nextLine();
                        System.out.println("Nhập Email cần sửa :");
                        String email = scanner.nextLine();
                        employee.setEmail(email);
                        break;
                    }
                    case 7: {
                        scanner.nextLine();
                        System.out.println("Nhập trình độ cần sửa :");
                        String level = scanner.nextLine();
                        employee.setLevel(level);
                        break;
                    }
                    case 8: {
                        scanner.nextLine();
                        System.out.println("Nhập vị trí cần sửa :");
                        String location = scanner.nextLine();
                        employee.setLocation(location);
                        break;
                    }
                    case 9: {
                            scanner.nextLine();
                            System.out.println("Nhập lương cần sửa :");
                            double wage = scanner.nextDouble();
                            employee.setWage(wage);
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
