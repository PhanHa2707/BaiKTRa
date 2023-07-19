package maytinh.dell;

import maytinh.MayTinh;
import maytinh.apple.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mipComputer {
    static void menu(List<MayTinh> mayTinhs, int n){
        do{System.out.println("1.Input");
            System.out.println("2.Display");
            System.out.println("3.Sort by price");
            System.out.println("4.Search by model");
            System.out.println("5.Exit");
            System.out.println("Chon menu:");
            n = Integer.parseInt(new Scanner(System.in).nextLine());
            if (n == 5) {
                System.out.println("Kết thúc!");
            }
            handleMenu(mayTinhs, n);
        } while (n != 5);
    }

    static void handleMenu(List<MayTinh> mayTinhs, int n) {
        switch (n) {
            case 1:
                input(mayTinhs);
                break;
            case 2:
                display(mayTinhs);
                break;
            case 3:
                sort(mayTinhs);
                break;
            case 4:
                searchModel(mayTinhs);
                break;
            default:
                break;
        }
    }



    static void input(List<MayTinh> mayTinhs) {

        for (int i = 0; i <3 ; i++) {
            System.out.println("Nhap thong tin 3 DEll:");
            Dell dell= new Dell();
            dell.inputInfor();
            mayTinhs.add(dell);

        }
        for (int i = 0; i <3 ; i++) {
            System.out.println("Nhap thong tin 3 APPLE:");
            Apple apple=new Apple();
            apple.inputInfor();
            mayTinhs.add(apple);
        }


    }
    static void display(List<MayTinh> lists) {
        System.out.println("Danh sách thông tin:");
        for (int i = 0; i < lists.size(); i++) {
            lists.get(i).displayInfor();
        }
    }
    static void sort(List<MayTinh> mayTinhs) {
        System.out.println("Danh sách trước sắp xếp là:");
        display(mayTinhs);
        System.out.println("Danh sách sau sắp xeêp:");
        Collections.sort(mayTinhs,(x, y)->{
            int warrantyx = 0;
            int warrantyy = 0;
            if(x instanceof Dell) {
                Dell dell=(Dell) x;
                warrantyx = dell.getWarranty();
            } else {
                Apple apple= (Apple) x;
                warrantyx=apple.getWarranty();
            }
            if(y instanceof Dell) {
                Dell dell = (Dell) y;
                warrantyy = dell.getWarranty();
            } else {
                Apple apple= (Apple) y;
                warrantyy=apple.getWarranty();
            }
            return warrantyx - warrantyy;
        });
        display(mayTinhs);
    }
    static void searchModel(List<MayTinh> mayTinhs) {
        boolean flag = false;
        for (int i = 0; i < mayTinhs.size(); i++) {
            if (mayTinhs.get(i).getName().equals("apple")) {
                mayTinhs.get(i).displayInfor();
                flag = true;
            }
        }
        if (flag == false) System.out.println("Không tìm thấy");
    }

    public static void main(String[] args) {
        int n=0;
        List<MayTinh> mayTinhs=new ArrayList<>();
        menu(mayTinhs,n);
    }
}
