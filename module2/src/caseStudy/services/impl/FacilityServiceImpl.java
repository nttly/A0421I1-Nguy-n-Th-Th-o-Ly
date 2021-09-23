package caseStudy.services.impl;

import caseStudy.modules.Facility;
import caseStudy.modules.Villa;
import caseStudy.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()){
            System.out.println("Service"+element.getKey()+"Số lần thuê :"+element.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập id:");
        String id = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ:");
        String  serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê:");
        double  cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng người tối đa:");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê:");
        String  rentalType = scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng:");
        String  roomStandard = scanner.nextLine();
        System.out.println("Nhập diện tích hồ bơi:");
        double  areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số tầng:");
        int  numberRoom = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(id,serviceName,area,cost,quantity,rentalType,roomStandard,areaPool,numberRoom);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới villa thành công");
    }

    @Override
    public void addNewHouse() {

    }

    @Override
    public void addNewRoom() {

    }

    @Override
    public void display() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
